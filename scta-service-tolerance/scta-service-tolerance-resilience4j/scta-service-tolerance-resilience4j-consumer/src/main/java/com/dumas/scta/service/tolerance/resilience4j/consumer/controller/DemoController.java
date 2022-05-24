package com.dumas.scta.service.tolerance.resilience4j.consumer.controller;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author dumas
 * @date 2022/05/24 3:15 PM
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CircuitBreakerFactory circuitBreakerFactory;

    @GetMapping("/get_user")
    public String getUser(@RequestParam("id") Integer id) {
        return circuitBreakerFactory.create("slow").run(new Supplier<String>() {
            @Override
            public String get() {
                logger.info("[getUser][准备调用 user-service 获取用户（{}）详情]", id);
                return restTemplate.getForEntity("http://129.0.0.1:18084/user/get?id=" + id, String.class).getBody();
            }
        }, new Function<Throwable, String>() {
            @Override
            public String apply(Throwable throwable) {
                logger.info("[getUserFallback][id({})exception({})]", id, throwable.getClass().getSimpleName());
                return "mock:User:" + id;
            }
        });
    }
}
