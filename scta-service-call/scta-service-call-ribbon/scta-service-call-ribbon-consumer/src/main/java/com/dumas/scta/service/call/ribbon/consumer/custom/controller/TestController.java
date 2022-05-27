package com.dumas.scta.service.call.ribbon.consumer.custom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 00:14
 */
@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/hello")
    public String hello(String name) {
        // 获得服务 `ribbon-provider` 的一个实例
        ServiceInstance instance = loadBalancerClient.choose("ribbon-provider");
        // 发起调用
        String targetUrl = instance.getUri() + "/echo?name=" + name;
        String response = restTemplate.getForObject(targetUrl, String.class);
        // 返回结果
        return "consumer:" + response;
    }

    @GetMapping("/hello02")
    public String hello02(String name) {
        // 直接使用 RestTemplate 调用服务 `ribbon-provider`
        String targetUrl = "http://ribbon-provider/echo?name=" + name;
        String response = restTemplate.getForObject(targetUrl, String.class);
        // 返回结果
        return "consumer:" + response;
    }
}
