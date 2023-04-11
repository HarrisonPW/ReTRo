package com.slb.service.Impl;

import com.slb.service.WelcomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

@Controller
public class WelcomeServiceImpl implements WelcomeService {
    @Override
    public String welcome(Model model, HttpSession session) {
        String email = (String) session.getAttribute("email");

        model.addAttribute("email", email);

        return "welcome";
    }

    @Override
    public String welcomePage() {
        return "welcome";
    }

    @Override
    public String login() {
        return "login";
    }

    @Override
    public String register() {
        return "register";
    }
}
