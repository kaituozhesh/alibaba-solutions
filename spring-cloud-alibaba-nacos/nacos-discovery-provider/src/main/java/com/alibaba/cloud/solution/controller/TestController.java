package com.alibaba.cloud.solution.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description
 * @Author kaituozhesh
 * @Date 2020/6/24 13:17
 * @Version V1.0.0
 **/
@Slf4j
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        log.info("invoked name = " + name);
        return "hello " + name;
    }

}
