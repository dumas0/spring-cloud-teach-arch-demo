package com.dumas.scta.register.center.consul.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 5:35 PM
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerApplication.class, args);
    }
}
