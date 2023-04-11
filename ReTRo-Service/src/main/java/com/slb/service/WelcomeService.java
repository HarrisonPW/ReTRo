package com.slb.service;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

public interface WelcomeService {
    @GetMapping("/welcome")
    String welcome(Model model, HttpSession session);

    @GetMapping("/")
    String welcomePage();

    @GetMapping("/login")
    String login();

    @GetMapping("/register")
    String register();
}
