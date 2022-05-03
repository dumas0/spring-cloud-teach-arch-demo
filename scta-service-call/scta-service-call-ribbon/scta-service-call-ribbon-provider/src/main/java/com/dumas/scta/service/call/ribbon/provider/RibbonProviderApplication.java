package com.dumas.scta.service.call.ribbon.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 00:01
 */
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonProviderApplication.class, args);
    }
}
