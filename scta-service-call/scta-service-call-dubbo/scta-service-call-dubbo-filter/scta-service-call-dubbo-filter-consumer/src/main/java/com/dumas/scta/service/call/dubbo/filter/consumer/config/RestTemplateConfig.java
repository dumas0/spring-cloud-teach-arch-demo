package com.dumas.scta.service.call.dubbo.filter.consumer.config;

import com.alibaba.cloud.dubbo.annotation.DubboTransported;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author dumas
 * @date 2022/05/26 11:14 AM
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    @DubboTransported(protocol = "dubbo")
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
