package com.dumas.scta.mq.stream.kafka.ack.message;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author dumas
 * @date 2022/05/19 10:59 AM
 */
@Data
@Accessors(chain = true)
public class Demo01Message {
    /**
     * 编号
     */
    private Integer id;
}
