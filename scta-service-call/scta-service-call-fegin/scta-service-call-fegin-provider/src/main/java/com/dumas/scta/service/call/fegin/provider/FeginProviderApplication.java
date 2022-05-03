package com.dumas.scta.service.call.fegin.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 00:57
 */
@EnableDiscoveryClient
@SpringBootApplication
public class FeginProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeginProviderApplication.class,args);
    }
}
