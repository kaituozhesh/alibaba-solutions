package com.alibaba.cloud.solution.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "nacos-discovery-provider")
public interface Client {
    @GetMapping("/hello")
    String hello(@RequestParam String name);
}
