package com.gateway.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试连接
 *
 * @author zhangyf
 * @date 2024/3/12 16:11
 */
@RestController
public class TestController {


    @RequestMapping("/test")
    public Integer Weight1(){
        System.out.println("test111111111111");
        return 1;
    }
    @RequestMapping("/test2/test")
    public Integer Weight12(){
        System.out.println("test2222222222222222");
        return 2;
    }
}
