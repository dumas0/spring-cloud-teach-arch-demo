package com.dumas.scta.service.tolerance.sentinel.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author dumas
 * @date 2022/05/20 3:20 PM
 */
@SpringBootApplication
public class SentinelRestTemplateConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelRestTemplateConsumerApplication.class, args);
    }
}
