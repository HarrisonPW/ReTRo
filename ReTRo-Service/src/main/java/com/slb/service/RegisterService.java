package com.slb.service;

import com.slb.common.api.BaseResponse;
import org.springframework.web.bind.annotation.PostMapping;

public interface RegisterService {

    @PostMapping("/register")
    BaseResponse<String> register(String email, String password);
}
