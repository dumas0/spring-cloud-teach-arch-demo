package com.dumas.scta.service.call.ribbon.provider.controller;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/05/04 00:10
 */
@RestController
public class TestController {
    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @Value("${server.port}")
    private Integer serverPort;

    @GetMapping("/echo")
    public String echo(String name) throws InterruptedException {
        // 模拟执行 100ms 时长。方便后续我们测试请求超时
        Thread.sleep(100L);

        // 记录被调用的日志
        logger.info("[echo][被调用啦 name({})]", name);

        return serverPort + "-provider:" + name;
    }
}
