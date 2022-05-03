package com.dumas.scta.nacos.config.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/03 10:02
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigProviderApplication.class, args);
    }
}
