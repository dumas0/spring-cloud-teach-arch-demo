package com.dumas.scta.service.tolerance.sentinel.consumer.config;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author dumas
 * @date 2022/05/23 11:32 AM
 */
@Configuration
public class RestTemplateConfiguration {
    @Bean
    @SentinelRestTemplate
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
