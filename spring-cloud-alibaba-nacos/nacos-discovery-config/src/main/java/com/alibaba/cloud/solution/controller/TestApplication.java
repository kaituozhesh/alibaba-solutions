package com.alibaba.cloud.solution.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestApplication
 * @Description RefreshScope动态实时刷新配置
 * @Author kaituozhesh
 * @Date 2020/6/24 14:38
 * @Version V1.0.0
 **/
@Slf4j
@RefreshScope
@RestController
public class TestApplication {

    @Value("${ktz.title}")
    private String title;


    @GetMapping("/title")
    public String hello() {
        return title;
    }
}
