package com.example.login.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/9/4
 * @desc
 */
@EnableWebSecurity
@Configuration
public class SpringSecurityConfiguration  extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
         http
                 .formLogin()
                 .loginPage("/login").permitAll()   //自定义登录页面
                 .successForwardUrl("/user/index")
                 .and()
                 .authorizeRequests()//其余所有请求都被会被拦截
                 .anyRequest()
                 .authenticated();
    }
}
