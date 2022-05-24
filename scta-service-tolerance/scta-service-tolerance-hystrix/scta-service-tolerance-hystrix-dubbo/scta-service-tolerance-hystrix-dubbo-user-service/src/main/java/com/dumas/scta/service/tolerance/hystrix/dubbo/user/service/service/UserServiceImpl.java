package com.dumas.scta.service.tolerance.hystrix.dubbo.user.service.service;

import com.dumas.scta.service.tolerance.hystrix.dubbo.api.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author dumas
 * @date 2022/05/24 2:06 PM
 */
@Service(protocol = "dubbo", version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public String getUser(Integer id) {
        return "User:" + id;
    }
}
