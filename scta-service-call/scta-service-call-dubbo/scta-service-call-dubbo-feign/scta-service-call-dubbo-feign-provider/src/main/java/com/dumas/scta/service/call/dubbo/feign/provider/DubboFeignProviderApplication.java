package com.dumas.scta.service.call.dubbo.feign.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 10:50 PM
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DubboFeignProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboFeignProviderApplication.class, args);
    }
}
