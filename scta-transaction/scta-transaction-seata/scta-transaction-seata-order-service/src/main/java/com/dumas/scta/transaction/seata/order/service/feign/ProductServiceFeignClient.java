package com.dumas.scta.transaction.seata.order.service.feign;

import com.dumas.scta.transaction.seata.order.service.feign.dto.ProductReduceStockDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * `product-service` 服务的 Feign 客户端
 *
 * @author dumas
 * @date 2022/05/20 10:56 AM
 */
@FeignClient(name = "product-service")
public interface ProductServiceFeignClient {

    /**
     * 扣减库存
     *
     * @param productReduceStockDTO
     */
    @PostMapping("/product/reduce-stock")
    void reduceStock(@RequestBody ProductReduceStockDTO productReduceStockDTO);
}
