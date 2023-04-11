package com.slb.service.Impl;

import com.slb.service.TestService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestServiceImpl implements TestService {

    public String TestServiceForDemo() {
        return "TestServiceForDemo";
    }
}
