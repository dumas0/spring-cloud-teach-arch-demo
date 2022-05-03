package com.dumas.scta.service.call.fegin.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 00:55
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeginConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeginConsumerApplication.class, args);
    }
}
