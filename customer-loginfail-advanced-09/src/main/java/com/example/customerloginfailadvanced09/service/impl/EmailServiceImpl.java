package com.example.customerloginfailadvanced09.service.impl;



import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Override
    public void send() {
        System.out.println("邮件发送邮件成功！");
    }

}
