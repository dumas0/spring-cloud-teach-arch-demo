package com.dumas.scta.register.center.eureka.server.standalone;

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
public class EurekaServerStandaloneApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStandaloneApplication.class, args);
    }
}
