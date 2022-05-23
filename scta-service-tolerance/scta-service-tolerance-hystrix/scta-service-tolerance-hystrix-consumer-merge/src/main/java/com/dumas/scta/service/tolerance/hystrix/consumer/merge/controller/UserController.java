package com.dumas.scta.service.tolerance.hystrix.consumer.merge.controller;

import com.dumas.scta.service.tolerance.hystrix.consumer.merge.service.CollapserService;
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

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author dumas
 * @date 2022/05/23 3:24 PM
 */
@RestController
@RequestMapping("/collapser-demo")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CollapserService collapserService;

    @HystrixCommand(fallbackMethod = "getUserFallback")
    @GetMapping("/test")
    public void test() throws ExecutionException, InterruptedException {
        logger.info("[test][准备获取用户信息]");
        Future<String> user01 = collapserService.getUserFuture(1);
        Future<String> user02 = collapserService.getUserFuture(2);
        logger.info("[test][提交获取用户信息]");

        logger.info("[test][user({})的结果为（{}）]", 1, user01.get());
        logger.info("[test][user({})的结果为（{}）]", 2, user02.get());
    }
}
