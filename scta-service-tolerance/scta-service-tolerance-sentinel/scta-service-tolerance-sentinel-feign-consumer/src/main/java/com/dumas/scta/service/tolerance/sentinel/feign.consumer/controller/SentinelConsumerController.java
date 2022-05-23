package com.dumas.scta.service.tolerance.sentinel.feign.consumer.controller;

import com.dumas.scta.service.tolerance.sentinel.feign.consumer.feign.SentinelProviderFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @date 2022/05/23 11:19 AM
 */
@RestController
@RequestMapping("/consumer")
public class SentinelConsumerController {

    private SentinelProviderFeignClient sentinelProviderFeignClient;

    @GetMapping("/echo")
    public String echo() {
        return sentinelProviderFeignClient.echo();
    }
}
