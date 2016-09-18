package com.xlinyu.controller;

import com.xlinyu.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gavin on 18/09/2016.
 */
@RestController
public class HelloWorldController {


    @RequestMapping("/")
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping("/user")
    public User user(){
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
        user.setPassword("abc123");
        return user;
    }
}
