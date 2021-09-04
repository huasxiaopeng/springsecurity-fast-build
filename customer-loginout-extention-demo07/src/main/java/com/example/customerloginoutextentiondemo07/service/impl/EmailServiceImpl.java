package com.example.customerloginoutextentiondemo07.service.impl;


import com.example.customerloginoutextentiondemo07.service.EmailService;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Override
    public void send() {
        System.out.println("邮件发送邮件成功！");
    }

}
