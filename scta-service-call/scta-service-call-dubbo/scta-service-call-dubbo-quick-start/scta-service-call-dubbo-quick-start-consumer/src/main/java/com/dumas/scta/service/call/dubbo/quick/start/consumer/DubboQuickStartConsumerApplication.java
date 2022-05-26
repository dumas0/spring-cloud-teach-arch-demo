package com.dumas.scta.service.call.dubbo.quick.start.consumer;

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
public class DubboQuickStartConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboQuickStartConsumerApplication.class, args);
    }
}
