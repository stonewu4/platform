package com.stone.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: stone
 * @Date: 2021/7/1 16:51
 * @Version 1.0
 */
@RestController
public class UserController {
    @GetMapping("/user/hello/first.do")
    public String first(){
        System.out.println("提供者:stone ");
        return "测试";
    }
}
