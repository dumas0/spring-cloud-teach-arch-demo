package com.dumas.scta.service.tolerance.sentinel.feign.consumer.feign;

import com.dumas.scta.service.tolerance.sentinel.feign.consumer.fallback.SentinelProviderFeignClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author dumas
 * @date 2022/05/23 11:10 AM
 */
@FeignClient(name = "scta-service-tolerance-sentinel-provider", url = "http://127.0.0.1:8080",
        fallbackFactory = SentinelProviderFeignClientFallbackFactory.class)
public interface SentinelProviderFeignClient {
    @GetMapping("/demo/echo")
    String echo();
}
