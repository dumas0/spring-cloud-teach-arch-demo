package com.dumas.scta.alibaba.nacos.config.properties;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author dumas
 * @date 2022/04/28 4:50 PM
 */
@Data
@Component
@NacosConfigurationProperties(prefix = "", dataId = "${nacos.config.data-id}", type = ConfigType.YAML, autoRefreshed = true)
public class TestProperties {
    /**
     * 测试属性
     */
    private String test;
}
