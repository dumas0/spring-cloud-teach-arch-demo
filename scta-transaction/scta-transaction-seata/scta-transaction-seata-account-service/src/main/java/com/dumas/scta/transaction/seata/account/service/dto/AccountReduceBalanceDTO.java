package com.dumas.scta.transaction.seata.account.service.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 扣减余额 DTO
 *
 * @author dumas
 * @date 2022/05/20 11:06 AM
 */
@Data
@Accessors(chain = true)
public class AccountReduceBalanceDTO {
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 扣减余额
     */
    private Integer price;
}
