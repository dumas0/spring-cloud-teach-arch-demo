package com.dumas.scta.service.call.feign.consumer.java.config.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * 全局 FeignClient 配置类
 *
 * @author dumas
 * @date 2022/05/24 4:45 PM
 */
public class DefaultFeignClientConfiguration {
    @Bean
    public Logger.Level defaultFeignClientLoggerLevel() {
        return Logger.Level.BASIC;
    }
}
