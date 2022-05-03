package com.dumas.scta.register.center.eureka.server.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 4:48 PM
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerSecurityApplication.class, args);
    }
}
