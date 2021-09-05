package com.example.usejdbcuserandpassword.service.impl;

import com.example.usejdbcuserandpassword.service.EmailService;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Override
    public void send() {
        System.out.println("邮件发送邮件成功！");
    }

}
