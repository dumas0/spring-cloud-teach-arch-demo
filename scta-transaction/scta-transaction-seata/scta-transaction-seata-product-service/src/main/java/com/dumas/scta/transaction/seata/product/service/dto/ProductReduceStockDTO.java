package com.dumas.scta.transaction.seata.product.service.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 扣减库存 DTO
 *
 * @author dumas
 * @date 2022/05/20 11:05 AM
 */
@Data
@Accessors(chain = true)
public class ProductReduceStockDTO {
    /**
     * 商品编号
     */
    private Long productId;
    /**
     * 数量
     */
    private Integer amount;
}
