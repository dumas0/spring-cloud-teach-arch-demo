package com.dumas.scta.service.call.feign.consumer.controller;

import com.dumas.scta.service.call.feign.consumer.feign.ProviderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 01:03
 */
@RestController
@RequestMapping("/demo")
public class ConsumerController {

    @Autowired
    private ProviderFeignClient providerFeignClient;

    @GetMapping("/hello02")
    public String hello02(String name) {
        // 使用 Feign 调用接口
        String response = providerFeignClient.echo(name);
        // 返回结果
        return "consumer:" + response;
    }

}
