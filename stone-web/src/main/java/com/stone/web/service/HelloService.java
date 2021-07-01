package com.stone.web.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: stone
 * @Date: 2021/7/1 17:20
 * @Version 1.0
 */
@FeignClient("User-Provider")
public interface HelloService {
    @GetMapping("/user/hello/first.do")
    String hello();
}
