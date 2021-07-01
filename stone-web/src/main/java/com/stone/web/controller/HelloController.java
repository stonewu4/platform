package com.stone.web.controller;

import com.stone.web.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: stone
 * @Date: 2021/7/1 17:22
 * @Version 1.0
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/api/hello/first.do")
    public String hellos(){
        return   helloService.hello();
    }
}
