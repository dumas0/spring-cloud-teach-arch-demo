package com.dumas.scta.alibaba.nacos.config.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author dumas
 * @date 2022/04/28 5:21 PM
 */
@SpringBootTest
public class JasyptTest {
    @Autowired
    private StringEncryptor encryptor;

    @Test
    public void encode() {
        String applicationName = "nacos-config";
        System.out.println(encryptor.encrypt(applicationName));
    }

    @Test
    public void decode() {
        String applicationName = "nacos-config";
        System.out.println(encryptor.decrypt(applicationName));
    }

    @Value("${spring.application.name}")
    //@NacosValue("${spring.application.name}")
    private String applicationName;

    @Test
    public void print() {
        System.out.println(applicationName);
    }
}
