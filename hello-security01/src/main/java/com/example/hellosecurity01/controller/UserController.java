package com.example.hellosecurity01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/9/4
 * @desc
 */
@RestController
public class UserController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
