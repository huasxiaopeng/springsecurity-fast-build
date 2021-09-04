package com.example.customerloginoutextentiondemo07.service.impl;


import com.example.customerloginoutextentiondemo07.service.SmsService;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements SmsService {

    @Override
    public void send() {
        System.out.println("短信发送成功！");
    }
}
