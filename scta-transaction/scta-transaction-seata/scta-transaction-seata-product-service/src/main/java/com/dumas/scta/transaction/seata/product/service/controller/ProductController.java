package com.dumas.scta.transaction.seata.product.service.controller;

import com.dumas.scta.transaction.seata.product.service.dto.ProductReduceStockDTO;
import com.dumas.scta.transaction.seata.product.service.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @date 2022/05/20 11:18 AM
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ProductService productService;

    @PostMapping("/reduce-stock")
    public void reduceStock(@RequestBody ProductReduceStockDTO productReduceStockDTO) throws Exception {
        logger.info("[reduceStock]收到减少库存请求，商品：{}，价格：{}", productReduceStockDTO.getProductId(), productReduceStockDTO.getAmount());
        productService.reduceStock(productReduceStockDTO.getProductId(), productReduceStockDTO.getAmount());
    }
}
