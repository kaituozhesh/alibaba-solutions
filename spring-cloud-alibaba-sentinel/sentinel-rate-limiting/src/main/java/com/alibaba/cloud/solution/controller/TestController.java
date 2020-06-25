package com.alibaba.cloud.solution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : TestController
 * @Description :
 * @Author : kaituozhesh
 * @Date: 2020-06-25 19:12
 * @Version: 1.0.0
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "didispace.com";
    }
}
