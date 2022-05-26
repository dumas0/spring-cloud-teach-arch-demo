package com.dumas.scta.service.call.dubbo.quick.start.api.dto;

import lombok.Data;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 10:39 PM
 */
@Data
public class UserAddDTO {
    /**
     * 昵称
     */
    private String name;
    /**
     * 性别
     */
    private Integer gender;
}
