package com.dumas.scta.service.call.dubbo.validation.consumer.controller;

import com.dumas.scta.service.call.dubbo.validation.api.dto.UserAddDTO;
import com.dumas.scta.service.call.dubbo.validation.api.dto.UserDTO;
import com.dumas.scta.service.call.dubbo.validation.consumer.feign.UserFeignRibbonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 11:03 PM
 */
@RestController
@RequestMapping("/feign/ribbon")
public class UserFeignRibbonController {
    @Autowired
    private UserFeignRibbonClient userFeignRibbonClient;

    @GetMapping("/get")
    public UserDTO get(@RequestParam("id") Integer id) {
        return userFeignRibbonClient.get(id);
    }

    @PostMapping("/add")
    public Integer add(UserAddDTO addDTO) {
        return userFeignRibbonClient.add(addDTO);
    }
}
