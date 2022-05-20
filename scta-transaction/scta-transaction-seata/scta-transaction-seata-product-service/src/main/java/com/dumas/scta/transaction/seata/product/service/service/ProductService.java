package com.dumas.scta.transaction.seata.product.service.service;

/**
 * @author dumas
 * @date 2022/05/20 11:19 AM
 */
public interface ProductService {
    /**
     * 扣减库存
     *
     * @param productId 产品ID
     * @param amount    扣减数量
     */
    void reduceStock(Long productId, Integer amount) throws Exception;
}
