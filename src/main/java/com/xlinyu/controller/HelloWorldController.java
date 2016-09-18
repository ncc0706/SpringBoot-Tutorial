package com.xlinyu.controller;

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

}
