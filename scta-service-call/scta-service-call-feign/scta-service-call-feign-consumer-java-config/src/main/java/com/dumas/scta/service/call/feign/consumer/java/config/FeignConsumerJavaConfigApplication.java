package com.dumas.scta.service.call.feign.consumer.java.config;

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
public class FeignConsumerJavaConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerJavaConfigApplication.class, args);
    }
}
