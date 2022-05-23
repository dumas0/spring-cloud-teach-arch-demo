package com.dumas.scta.service.tolerance.hystrix.consumer.merge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author dumas
 * @date 2022/05/23 3:21 PM
 */
@EnableCircuitBreaker
@SpringBootApplication
public class HystrixConsumerMergeApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixConsumerMergeApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
