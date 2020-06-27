package com.alibaba.cloud.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : UserApplication
 * @Description :
 * @Author : kaituozhesh
 * @Date: 2020-06-27 16:59
 * @Version: 1.0.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
