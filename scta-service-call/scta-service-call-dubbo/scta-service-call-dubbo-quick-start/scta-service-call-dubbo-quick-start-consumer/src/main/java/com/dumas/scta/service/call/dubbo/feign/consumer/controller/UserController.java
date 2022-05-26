package com.dumas.scta.service.call.dubbo.feign.consumer.controller;

import com.dumas.scta.service.call.dubbo.quick.start.api.api.UserService;
import com.dumas.scta.service.call.dubbo.quick.start.api.dto.UserAddDTO;
import com.dumas.scta.service.call.dubbo.quick.start.api.dto.UserDTO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 11:03 PM
 */
@RestController
public class UserController {
    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/get")
    public UserDTO get(@RequestParam("id") Integer id) {
        return userService.get(id);
    }

    @PostMapping("/add")
    public Integer add(UserAddDTO addDTO) {
        return userService.add(addDTO);
    }
}
