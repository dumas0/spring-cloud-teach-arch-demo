package com.dumas.scta.service.tolerance.sentinel.feign.consumer.fallback;

import com.dumas.scta.service.tolerance.sentinel.feign.consumer.feign.SentinelProviderFeignClient;

/**
 * @author dumas
 * @date 2022/05/23 11:16 AM
 */
public class SentinelProviderFeignClientFallback implements SentinelProviderFeignClient {
    
    private Throwable throwable;

    public SentinelProviderFeignClientFallback(Throwable throwable) {
        this.throwable = throwable;
    }

    @Override
    public String echo() {
        return "fallback:" + throwable.getClass().getSimpleName();
    }
}
