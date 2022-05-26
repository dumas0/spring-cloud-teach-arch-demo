package com.dumas.scta.service.call.dubbo.feign.provider.springmvc.service;

import com.dumas.scta.service.call.dubbo.quick.start.api.api.UserService;
import com.dumas.scta.service.call.dubbo.quick.start.api.dto.UserAddDTO;
import com.dumas.scta.service.call.dubbo.quick.start.api.dto.UserDTO;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 10:58 PM
 */
@Service(protocol = {"dubbo"}, version = "1.0.0")
@RestController
@RequestMapping("/user")
public class UserServiceImpl implements UserService {

    @GetMapping("/get")
    @Override
    public UserDTO get(@QueryParam("id") Integer id) {
        return new UserDTO().setId(id)
                .setName("没有昵称：" + id)
                .setGender(id % 2 + 1);
    }

    @PostMapping("/add")
    @Override
    public Integer add(UserAddDTO addDTO) {
        return (int) (System.currentTimeMillis() / 1000);
    }
}
