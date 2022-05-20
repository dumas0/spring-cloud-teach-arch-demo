package com.dumas.scta.service.tolerance.sentinel.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @date 2022/05/20 3:23 PM
 */
@RestController
@RequestMapping("/demo")
public class SentinelController {

    @GetMapping("/echo")
    public String echo() {
        return "echo";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
