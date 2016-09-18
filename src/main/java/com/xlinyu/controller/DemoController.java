package com.xlinyu.controller;

import com.xlinyu.domain.Demo;
import com.xlinyu.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by gavin on 18/09/2016.
 */
@Controller
public class DemoController {

    @Resource
    private DemoService demoService;

    @ResponseBody
    @RequestMapping("/demo/{message}")
    public Demo saveDemo(@PathVariable String message){

        Demo demo = new Demo();
        demo.setText(message);
        demoService.save(demo);
        return demo;
    }

    @ResponseBody
    @RequestMapping("/demos")
    public List<Demo> demos(){
        List<Demo> demos = demoService.demos();
        return demos;
    }
}
