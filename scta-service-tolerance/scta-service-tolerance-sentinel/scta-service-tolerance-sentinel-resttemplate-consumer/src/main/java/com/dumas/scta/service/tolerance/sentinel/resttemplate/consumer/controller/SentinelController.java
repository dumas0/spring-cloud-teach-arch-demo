package com.dumas.scta.service.tolerance.sentinel.resttemplate.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dumas
 * @date 2022/05/20 3:23 PM
 */
@RestController
@RequestMapping("/demo")
public class SentinelController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/echo")
    public String echo() {
        return restTemplate.getForObject("http://127.0.0.1:8080/demo/echo", String.class);
    }
}
