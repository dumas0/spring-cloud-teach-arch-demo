package com.dumas.scta.nacos.config.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/03 10:11
 */
@RestController
public class TestController {
    @GetMapping("/echo")
    public String echo(String name) {
        return "provider:" + name;
    }
}
