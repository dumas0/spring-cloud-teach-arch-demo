package com.dumas.scta.service.call.dubbo.quick.start.api.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 10:45 PM
 */
@Data
@Accessors(chain = true)
public class UserDTO implements Serializable {
    /**
     * 用户编号
     */
    private Integer id;
    /**
     * 昵称
     */
    private String name;
    /**
     * 性别
     */
    private Integer gender;
}
