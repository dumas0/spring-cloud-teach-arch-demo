package com.dumas.scta.service.call.dubbo.filter.api.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
    @NotEmpty(message = "昵称不能为空")
    @Length(min = 5, max = 16, message = "账号长度为 5-16 位")
    private String name;
    /**
     * 性别
     */
    @NotNull(message = "性别不能为空")
    private Integer gender;
}
