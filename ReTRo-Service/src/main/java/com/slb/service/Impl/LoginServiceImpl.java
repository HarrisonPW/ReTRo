package com.slb.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.slb.common.api.BaseApiService;
import com.slb.common.api.BaseResponse;
import com.slb.common.util.MD5Utils;
import com.slb.entity.SlbUser;
import com.slb.mapper.SlbUserMapper;
import com.slb.service.LoginService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginServiceImpl extends BaseApiService implements LoginService {

    @Autowired
    private SlbUserMapper slbUserMapper;

    @Override
    public BaseResponse<String> login(String email, String password, HttpSession session) {
        if (StringUtils.isEmpty(email)) {
            return setResultError("email is null");
        }
        if (StringUtils.isEmpty(password)) {
            return setResultError("password is null");
        }
        QueryWrapper<SlbUser> slbUserQueryWrapper = new QueryWrapper<>();
        slbUserQueryWrapper.eq("email", email);
        SlbUser slbUser = slbUserMapper.selectOne(slbUserQueryWrapper);
        if (slbUser == null) {
            return setResultError("email is not exist");
        }
        String DbPassword = slbUser.getPassword();
        String userPassword = MD5Utils.md5(password + slbUser.getSalt());
        if (!DbPassword.equals(userPassword)) {
            return setResultError("password is error");
        }

        session.setAttribute("email", email);

        return setResultSuccess();
    }
}
