package com.dumas.scta.register.center.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/03 11:13
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

    @RestController
    static class TestController {
        @GetMapping("/echo")
        public String echo(String name) {
            return "provider:" + name;
        }
    }
}
