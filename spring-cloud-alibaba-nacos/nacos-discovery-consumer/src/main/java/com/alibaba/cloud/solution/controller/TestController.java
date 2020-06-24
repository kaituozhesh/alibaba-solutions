package com.alibaba.cloud.solution.controller;

import com.alibaba.cloud.solution.feign.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName TestController
 * @Description
 * @Author kaituozhesh
 * @Date 2020/6/24 13:22
 * @Version V1.0.0
 **/
@Slf4j
@RestController
public class TestController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Resource
    private Client client;

    @GetMapping("/test")
    public String test() {
        // 通过spring cloud common中的负载均衡接口选取服务提供节点实现接口调用
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-discovery-provider");
        String url = serviceInstance.getUri() + "/hello?name=" + "ktz";
        System.out.println(url);
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        return "Invoke : " + url + ", return : " + result;
    }

    @GetMapping("/test_feign")
    public String testFeign() {
        return client.hello("ktzsh");
    }


}
