package com.dumas.scta.service.call.dubbo.filter.consumer.controller;

import com.dumas.scta.service.call.dubbo.feign.api.api.UserService;
import com.dumas.scta.service.call.dubbo.feign.api.dto.UserAddDTO;
import com.dumas.scta.service.call.dubbo.feign.api.dto.UserDTO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 11:03 PM
 */
@RestController
@RequestMapping("/dubbo")
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
