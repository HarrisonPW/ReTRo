package com.slb.service;

import org.springframework.web.bind.annotation.GetMapping;

public interface TestService {
    @GetMapping("/testServiceForDemo")
    String TestServiceForDemo();
}
