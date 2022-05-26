package com.dumas.scta.service.call.dubbo.sentinel.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 10:52 PM
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DubboSentinelConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboSentinelConsumerApplication.class, args);
    }
}
