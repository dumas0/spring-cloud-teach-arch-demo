package com.dumas.scta.service.call.feign.consumer.external.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * feign 外部调用
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 01:07
 */
//注意，保持 name 属性和 url 属性的 host 是一致的
@FeignClient(name = "external-service", url = "http://external-service")
public interface ProviderFeignClient {

    @GetMapping("/echo")
    String echo(@RequestParam("name") String name);
}
