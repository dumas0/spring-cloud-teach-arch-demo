package com.dumas.scta.transaction.seata.order.service.dao;

import com.dumas.scta.transaction.seata.order.service.entity.OrderDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

/**
 * @author dumas
 * @date 2022/05/20 10:56 AM
 */
@Mapper
@Repository
public interface OrderDao {

    /**
     * 插入订单记录
     *
     * @param order
     * @return
     */
    @Insert("INSERT INTO orders (user_id, product_id, pay_amount) VALUES (#{userId}, #{productId}, #{payAmount})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    int saveOrder(OrderDO order);
}
