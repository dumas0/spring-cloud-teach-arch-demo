package com.dumas.scta.service.tolerance.resilience4j.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author dumas
 * @date 2022/05/24 3:14 PM
 */
@SpringBootApplication
public class Resilience4jConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Resilience4jConsumerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
