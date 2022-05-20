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
     * @param userId
     * @param productId
     * @param price
     * @return
     */
    Integer createOrder(Long userId, Long productId, Integer price);
}
