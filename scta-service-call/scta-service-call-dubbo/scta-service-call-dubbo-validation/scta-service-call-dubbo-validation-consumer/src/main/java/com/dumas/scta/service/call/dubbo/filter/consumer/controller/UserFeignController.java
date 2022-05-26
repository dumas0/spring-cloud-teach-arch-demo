package com.dumas.scta.service.call.dubbo.filter.consumer.controller;

import com.dumas.scta.service.call.dubbo.validation.api.dto.UserAddDTO;
import com.dumas.scta.service.call.dubbo.validation.api.dto.UserDTO;
import com.dumas.scta.service.call.dubbo.filter.consumer.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 11:03 PM
 */
@RestController
@RequestMapping("/feign")
public class UserFeignController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/get")
    public UserDTO get(@RequestParam("id") Integer id) {
        return userFeignClient.get(id);
    }

    @PostMapping("/add")
    public Integer add(UserAddDTO addDTO) {
        return userFeignClient.add(addDTO);
    }
}
