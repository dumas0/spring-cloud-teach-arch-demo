package com.dumas.scta.service.tolerance.sentinel.feign.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author dumas
 * @date 2022/05/20 3:20 PM
 */
@EnableFeignClients
@SpringBootApplication
public class SentinelFeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelFeignConsumerApplication.class, args);
    }
}
