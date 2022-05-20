package com.dumas.scta.transaction.seata.account.service.service;

/**
 * @author dumas
 * @date 2022/05/20 1:53 PM
 */
public interface AccountService {
    /**
     * 扣除余额
     *
     * @param userId 用户编号
     * @param price  扣减金额
     */
    void reduceBalance(Long userId, Integer price) throws Exception;
}
