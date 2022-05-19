package com.dumas.scta.mq.bus.kafka.publisher.controller;

import com.dumas.scta.mq.bus.kafka.publisher.event.UserRegisterEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.ServiceMatcher;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @date 2022/05/19 4:43 PM
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    private ServiceMatcher busServiceMatcher;

    public String register(String username){
        // ... 执行注册逻辑
        logger.info("[register][执行用户（{}）的注册逻辑]", username);

        // ...
        applicationEventPublisher.publishEvent(new UserRegisterEvent(this, busServiceMatcher.getBusId(), null, username));
        return "success";
    }
}
