package com.dumas.scta.register.center.zookeeper.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 5:14 PM
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ZookeeperConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperConsumerApplication.class, args);
    }
}
