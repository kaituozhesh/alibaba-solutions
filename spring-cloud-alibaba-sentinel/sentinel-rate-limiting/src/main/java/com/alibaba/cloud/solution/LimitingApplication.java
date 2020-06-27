package com.alibaba.cloud.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : LimitingApplication
 * @Description :
 * @Author : kaituozhesh
 * @Date: 2020-06-25 19:03
 * @Version: 1.0.0
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class LimitingApplication {

    public static void main(String[] args) {
        SpringApplication.run(LimitingApplication.class, args);
    }
}
