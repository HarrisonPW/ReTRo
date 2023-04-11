package com.slb.service;

import com.slb.common.api.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

public interface LoginService {

    @PostMapping("login")
    BaseResponse<String> login(String email, String password, HttpSession session);
}
