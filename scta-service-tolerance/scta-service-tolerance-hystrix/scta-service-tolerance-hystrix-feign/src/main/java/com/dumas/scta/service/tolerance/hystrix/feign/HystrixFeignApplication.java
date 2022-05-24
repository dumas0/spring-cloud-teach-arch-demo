package com.dumas.scta.service.tolerance.hystrix.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author dumas
 * @date 2022/05/24 11:10 AM
 */
@EnableCircuitBreaker
@EnableFeignClients
@SpringBootApplication
public class HystrixFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixFeignApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
