package com.dumas.scta.service.call.dubbo.validation.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 10:52 PM
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class DubboValidationConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboValidationConsumerApplication.class, args);
    }
}
