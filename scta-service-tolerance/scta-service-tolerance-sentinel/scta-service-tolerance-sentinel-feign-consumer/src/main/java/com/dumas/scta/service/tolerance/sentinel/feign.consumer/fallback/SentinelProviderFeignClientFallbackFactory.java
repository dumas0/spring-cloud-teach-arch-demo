package com.dumas.scta.service.tolerance.sentinel.feign.consumer.fallback;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author dumas
 * @date 2022/05/23 11:13 AM
 */
@Component
public class SentinelProviderFeignClientFallbackFactory implements FallbackFactory<SentinelProviderFeignClientFallbackFactory> {
    public SentinelProviderFeignClientFallbackFactory(Throwable cause) {

    }

    @Override
    public SentinelProviderFeignClientFallbackFactory create(Throwable cause) {
        // 可以给 SentinelProviderFeignClientFallback 提供具体的 throwable 异常
        return new SentinelProviderFeignClientFallbackFactory(cause);
    }
}
