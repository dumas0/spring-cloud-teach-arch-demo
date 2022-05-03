package com.dumas.scta.register.center.consul.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 5:37 PM
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulProviderApplication.class, args);
    }

    @RestController
    static class TestController {
        @GetMapping("/echo")
        public String echo(String name) {
            return "provider:" + name;
        }
    }
}
