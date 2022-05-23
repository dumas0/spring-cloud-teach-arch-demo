package com.dumas.scta.service.tolerance.hystrix.consumer.cache.controller;

import com.dumas.scta.service.tolerance.hystrix.consumer.cache.service.CacheService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dumas
 * @date 2022/05/23 3:24 PM
 */
@RestController
@RequestMapping("/demo")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CacheService cacheService;

    @GetMapping("/get_user")
    public String getUser(@RequestParam("id") Integer id) {
        String userA = cacheService.getUser(id);
        String userB = cacheService.getUser(id);
        String userC = cacheService.getUser(id);
        return userC;
    }

    @GetMapping("/update_user")
    public String updateUser(@RequestParam("id") Integer id) {
        String userA = cacheService.getUser(id);
        cacheService.updateUser(id);
        String userC = cacheService.getUser(id);
        return userC;
    }
}
