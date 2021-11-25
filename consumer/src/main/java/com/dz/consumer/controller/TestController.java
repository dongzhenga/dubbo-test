package com.dz.consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dz.service.TestService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Satsuki
 * @time 2019/8/27 15:58
 * @description:
 * 调用dubbo
 */
@RestController
@RequestMapping("/test")
public class TestController {

//    @Resource
//    private TestService testServiceImpl;
    @Reference(version = "1.0.0")
    private TestService testServiceImpl;

    @RequestMapping("/ins")
    public String ins(){
        return testServiceImpl.ins();
    }

    @RequestMapping("/del")
    public String del(){
       return testServiceImpl.del();
    }

    @RequestMapping("/upd")
    public String upd(){
        return testServiceImpl.upd();
    }

    @RequestMapping("/sel")
    public String sel(){
        return testServiceImpl.sel();
    }
}
