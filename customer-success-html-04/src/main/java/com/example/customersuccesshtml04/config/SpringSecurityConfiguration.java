package com.example.customersuccesshtml04.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
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
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "/js/**", "/plugins/**", "/images/**", "/fonts/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin().loginPage("/login")
                .defaultSuccessUrl("/index")
                .permitAll()
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated()
        ;
    }
    /**
     * 接下来，访问系统根路径 http://localhost:8080，从原理上讲，应该跳转到根路径页面，由于系统配置访问根路径时，重定向到首页，所以，在用户成功登录后，会先重定向到根路径，然后又重定向到首页。
     * 到此，可能还会有疑问，如果我要让系统不管什么情况，不管之前输入的什么地址，在成功登录后，都跳转到各自的个人中心、亦或是首页呢
     * 这个需求也很常见，比如，做自媒体的应该有感受，我们登录某个自媒体后台后，一般情况下，会直接跳转到后台的个人中心，展示一些统计信息，如粉丝数、收益等等。
     *
     * Spring Security 也提供了这个配置项。
     *
     * http.formLogin().loginPage("/login").defaultSuccessUrl("/user/index", true).permitAll()
     */
}
