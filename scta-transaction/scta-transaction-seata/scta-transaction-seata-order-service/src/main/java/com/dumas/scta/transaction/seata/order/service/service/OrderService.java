package com.dumas.scta.transaction.seata.order.service.service;

/**
 * 订单 Service
 *
 * @author dumas
 * @date 2022/05/20 10:50 AM
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param userId    用户编号
     * @param productId 产品编号
     * @param price     价格
     * @return 订单编号
     */
    Integer createOrder(Long userId, Long productId, Integer price);
}
