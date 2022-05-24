package com.dumas.scta.service.tolerance.hystrix.feign.feign;

import com.dumas.scta.service.tolerance.hystrix.feign.fallback.UserServiceFeignClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dumas
 * @date 2022/05/24 11:13 AM
 */
@FeignClient(name = "scta-service-tolerance-hystrix-user-service",
fallbackFactory = UserServiceFeignClientFallbackFactory.class)
public interface UserServiceFeignClient {

    @GetMapping("/user/get")
    String getUser(@RequestParam("id") Integer id);
}
