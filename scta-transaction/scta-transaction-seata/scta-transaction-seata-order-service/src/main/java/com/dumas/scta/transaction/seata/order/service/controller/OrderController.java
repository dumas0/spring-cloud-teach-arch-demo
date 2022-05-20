package com.dumas.scta.transaction.seata.order.service.controller;

import com.dumas.scta.transaction.seata.order.service.service.OrderService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @date 2022/05/20 10:49 AM
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Reference
    private OrderService orderService;

    @PostMapping("/create")
    public Integer createOrder(
            @RequestParam("userId") Long userId,
            @RequestParam("productId") Long productId,
            @RequestParam("price") Integer price
    ){
        logger.info("[createOrder]收到的下单请求，用户：{}，商品：{}，价格：{}", userId, productId, price);
        return orderService.createOrder(userId, productId, price);
    }
}
