package com.alibaba.cloud.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ProviderApplication
 * @Description
 * @Author kaituozhesh
 * @Date 2020/6/24 11:30
 * @Version V1.0.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
