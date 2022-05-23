package com.dumas.scta.service.tolerance.hystrix.consumer.cache.config;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author dumas
 * @date 2022/05/23 3:44 PM
 */
@Component
@WebFilter(urlPatterns = "/")
public class HystrixRequestContextFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        // 初始化 HystrixRequestContext
        HystrixRequestContext context = HystrixRequestContext.initializeContext();
        // 继续过滤器
        try {
            chain.doFilter(servletRequest, servletResponse);
        } finally {
            // 销毁 HystrixRequestContext
            context.close();
        }
    }
}