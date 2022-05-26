package com.dumas.scta.service.call.dubbo.validation.api.api;

import com.dumas.scta.service.call.dubbo.validation.api.dto.UserAddDTO;
import com.dumas.scta.service.call.dubbo.validation.api.dto.UserDTO;

import javax.validation.constraints.NotNull;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 10:46 PM
 */
public interface UserService {
    /**
     * 根据指定用户编号，获得用户信息
     *
     * @param id 用户编号
     * @return 用户信息
     */
    UserDTO get(@NotNull(message = "用户编号不能为空") Integer id);

    /**
     * 添加新用户，返回新添加的用户编号
     *
     * @param addDTO 添加的用户信息
     * @return 用户编号
     */
    Integer add(UserAddDTO addDTO);
}
