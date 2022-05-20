package com.dumas.scta.transaction.seata.order.service.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 订单实体
 * @author dumas
 * @date 2022/05/20 10:57 AM
 */
@Data
@Accessors(chain = true)
public class OrderDO {
    /**
     * 订单编号
     */
    private Integer id;
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 产品编号
     */
    private Long productId;
    /**
     * 支付金额
     */
    private Integer payAmount;
}
