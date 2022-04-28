package com.dumas.scta.alibaba.nacos.config.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.dumas.scta.alibaba.nacos.config.properties.TestProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @date 2022/04/28 4:51 PM
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Value("${test}")
    @NacosValue(value = "${test}", autoRefreshed = true)
    private String test;

    @GetMapping("/test")
    public String test() {
        return test;
    }

    @Autowired
    private TestProperties testProperties;

    @GetMapping("/test_properties")
    public TestProperties testProperties() {
        return testProperties;
    }

    @GetMapping("/logger")
    public void logger() {
        log.debug("[logger][测试一下]");
    }
}
