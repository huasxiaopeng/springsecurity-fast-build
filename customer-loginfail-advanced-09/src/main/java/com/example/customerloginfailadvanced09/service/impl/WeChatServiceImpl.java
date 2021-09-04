package com.example.customerloginfailadvanced09.service.impl;


import org.springframework.stereotype.Service;

@Service
public class WeChatServiceImpl implements WeChatService {

    @Override
    public void send() {
        System.out.println("微信消息发送成功！");
    }
}
