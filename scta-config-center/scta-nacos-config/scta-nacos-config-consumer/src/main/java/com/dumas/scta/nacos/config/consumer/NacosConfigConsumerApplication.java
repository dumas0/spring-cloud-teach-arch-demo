package com.dumas.scta.nacos.config.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/03 09:59
 */
//@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigConsumerApplication.class, args);
    }
}
