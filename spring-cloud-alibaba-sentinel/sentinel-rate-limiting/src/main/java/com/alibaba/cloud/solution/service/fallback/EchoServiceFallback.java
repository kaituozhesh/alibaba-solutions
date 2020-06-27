package com.alibaba.cloud.solution.service.fallback;

import com.alibaba.cloud.solution.service.EchoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ClassName : EchoServiceFallback
 * @Description :
 * @Author : kaituozhesh
 * @Date: 2020-06-27 13:42
 * @Version: 1.0.0
 */
@Slf4j
@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String hello(String name) {
        log.info("打招呼服务熔断");
        return "熔断";
    }
}
