package com.alibaba.cloud.solution.controller;

import com.alibaba.cloud.solution.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @Autowired
    private EchoService echoService;

    @GetMapping("/hello")
    public String hello() {
        return "didispace.com";
    }

    @GetMapping("/say_hello")
    public String sayHello(@RequestParam String name) {
        return echoService.hello(name);
    }

}
