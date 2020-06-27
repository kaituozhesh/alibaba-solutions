package com.alibaba.cloud.solution.service;

import com.alibaba.cloud.solution.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "nacos-discovery-provider", fallback = EchoServiceFallback.class)
public interface EchoService {

    @GetMapping("/hello")
    String hello(@RequestParam String name);

}
