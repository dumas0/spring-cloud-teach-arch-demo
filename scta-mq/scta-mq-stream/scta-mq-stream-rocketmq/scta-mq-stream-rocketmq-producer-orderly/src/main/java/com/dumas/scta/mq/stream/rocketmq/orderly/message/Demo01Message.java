package com.dumas.scta.mq.stream.rocketmq.orderly.message;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 21:51
 */
@Data
@Accessors(chain = true)
public class Demo01Message {
    /**
     * 编号
     */
    private Integer id;
}
