package com.dumas.scta.service.tolerance.resilience4j.user.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dumas
 * @date 2022/05/24 3:03 PM
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get")
    public String get(@RequestParam("id") Integer id) {
        return "User:" + id;
    }

    @GetMapping("/batch_get")
    public List<String> batchGet(@RequestParam("ids") List<Integer> ids) {
        return ids.stream().map(id -> "User:" + id).collect(Collectors.toList());
    }
}
