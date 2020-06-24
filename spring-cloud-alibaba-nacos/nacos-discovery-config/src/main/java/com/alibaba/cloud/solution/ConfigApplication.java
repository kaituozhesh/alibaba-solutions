package com.alibaba.cloud.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ConfigApplication
 * @Description
 * @Author kaituozhesh
 * @Date 2020/6/24 14:32
 * @Version V1.0.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
