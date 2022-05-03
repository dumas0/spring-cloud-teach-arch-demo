package com.dumas.scta.register.center.eureka.server.cluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/03 11:13
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerClusterApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerClusterApplication.class, args);
    }
}
