package com.dumas.scta.transaction.seata.order.service.service.impl;

import com.dumas.scta.transaction.seata.order.service.dao.OrderDao;
import com.dumas.scta.transaction.seata.order.service.entity.OrderDO;
import com.dumas.scta.transaction.seata.order.service.feign.AccountServiceFeignClient;
import com.dumas.scta.transaction.seata.order.service.feign.ProductServiceFeignClient;
import com.dumas.scta.transaction.seata.order.service.feign.dto.AccountReduceBalanceDTO;
import com.dumas.scta.transaction.seata.order.service.feign.dto.ProductReduceStockDTO;
import com.dumas.scta.transaction.seata.order.service.service.OrderService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dumas
 * @date 2022/05/20 10:53 AM
 */
@Service
public class OrderServiceImpl implements OrderService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private AccountServiceFeignClient accountService;
    @Autowired
    private ProductServiceFeignClient productService;

    @GlobalTransactional
    @Override
    public Integer createOrder(Long userId, Long productId, Integer price) {
        // 购买数量，暂时设置为 1
        Integer amount = 1;

        logger.info("[createOrder] 当前 XID: {}", RootContext.getXID());

        // 扣减库存
        productService.reduceStock(new ProductReduceStockDTO().setProductId(productId).setAmount(amount));

        // 扣减余额
        accountService.reduceBalance(new AccountReduceBalanceDTO().setUserId(userId).setPrice(price));

        // 保存订单
        OrderDO order = new OrderDO().setUserId(userId).setProductId(productId).setPayAmount(amount * price);
        orderDao.saveOrder(order);
        logger.info("[createOrder]保存订单：{}", order.getId());

        // 返回订单编号
        return order.getId();
    }
}
