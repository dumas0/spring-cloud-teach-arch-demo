package com.dumas.scta.service.call.feign.consumer.java.config.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 * 局部 FeignClient 配置类
 *
 * @author dumas
 * @date 2022/05/24 4:47 PM
 */
public class DemoProviderFeignClientConfiguration {

    @Bean
    @Primary
    public Logger.Level feignClientLoggerLevel() {
        return Logger.Level.FULL;
    }
}
