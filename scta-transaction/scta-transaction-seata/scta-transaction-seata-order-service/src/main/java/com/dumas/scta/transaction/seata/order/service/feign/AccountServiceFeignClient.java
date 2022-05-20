package com.dumas.scta.transaction.seata.order.service.feign;

import com.dumas.scta.transaction.seata.order.service.feign.dto.AccountReduceBalanceDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * `account-service` 服务的 Feign 客户端
 *
 * @author dumas
 * @date 2022/05/20 10:56 AM
 */
@FeignClient("account-service")
public interface AccountServiceFeignClient {

    /**
     * 扣减余额
     *
     * @param accountReduceBalanceDTO
     */
    @PostMapping("/account/reduce-balance")
    void reduceBalance(@RequestBody AccountReduceBalanceDTO accountReduceBalanceDTO);
}
