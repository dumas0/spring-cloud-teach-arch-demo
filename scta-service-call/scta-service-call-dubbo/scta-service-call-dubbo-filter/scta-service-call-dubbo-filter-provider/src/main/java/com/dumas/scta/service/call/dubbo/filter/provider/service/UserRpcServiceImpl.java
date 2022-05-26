package com.dumas.scta.service.call.dubbo.filter.provider.service;

import com.dumas.scta.service.call.dubbo.filter.api.api.UserService;
import com.dumas.scta.service.call.dubbo.filter.api.core.ServiceException;
import com.dumas.scta.service.call.dubbo.filter.api.core.ServiceExceptionEnum;
import com.dumas.scta.service.call.dubbo.filter.api.dto.UserAddDTO;
import com.dumas.scta.service.call.dubbo.filter.api.dto.UserDTO;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author dumas
 * @date 2022/05/26 3:43 PM
 */
@Service(protocol = "dubbo", version = "1.0.0", validation = "true", filter = "-exception")
public class UserRpcServiceImpl implements UserService {
    @Override
    public UserDTO get(Integer id) {
        return new UserDTO().setId(id)
                .setName("没有昵称：" + id)
                .setGender(id % 2 + 1);
    }

    @Override
    public Integer add(UserAddDTO addDTO) {
        // 模拟用户已经存在的情况
        if ("dumas".equals(addDTO.getName())) {
            throw new ServiceException(ServiceExceptionEnum.USER_EXISTS);
        }
        return (int) (System.currentTimeMillis() / 1000);
    }
}
