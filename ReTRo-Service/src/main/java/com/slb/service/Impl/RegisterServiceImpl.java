package com.slb.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.slb.common.api.BaseApiService;
import com.slb.common.api.BaseResponse;
import com.slb.common.util.MD5Utils;
import com.slb.common.util.SaltUtils;
import com.slb.entity.SlbUser;
import com.slb.mapper.SlbUserMapper;
import com.slb.service.RegisterService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterServiceImpl extends BaseApiService implements RegisterService {

    @Autowired
    private SlbUserMapper slbUserMapper;

    public void setSlbUserMapper(SlbUserMapper slbUserMapper) {
        this.slbUserMapper = slbUserMapper;
    }

    @Override
    public BaseResponse<String> register(String email, String password) {
        if (StringUtils.isEmpty(email)) {
            return setResultError("email is null");
        }
        if (StringUtils.isEmpty(password)) {
            return setResultError("password is null");
        }
        QueryWrapper<SlbUser> slbUserQueryWrapper = new QueryWrapper<>();
        slbUserQueryWrapper.eq("email", email);
        SlbUser slbUser = slbUserMapper.selectOne(slbUserQueryWrapper);
        if (slbUser != null) {
            return setResultError("email is exist");
        }
        String salt = SaltUtils.getSalt();
        SlbUser slbUser1 = new SlbUser(email, MD5Utils.md5(password + salt), salt);
        int insert = slbUserMapper.insert(slbUser1);
        return setResultDB(insert);
    }
}
