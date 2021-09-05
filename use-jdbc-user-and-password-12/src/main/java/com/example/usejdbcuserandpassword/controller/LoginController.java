package com.example.usejdbcuserandpassword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/login_fail")
    public String loginFail(HttpServletRequest request, Model model) {

        return "login_fail";
    }

}
