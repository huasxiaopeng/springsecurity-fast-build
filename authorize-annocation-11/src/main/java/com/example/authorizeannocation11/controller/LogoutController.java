package com.example.authorizeannocation11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {

    @RequestMapping("/logout_success")
    public String logoutSuccess() {
        return "logout_success";
    }

}
