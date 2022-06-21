# spring-cloud-teach-arch-demo

## 项目介绍
SpringCloud Project Demo.


## 目录结构
```
spring-cloud-teach-arch-demo
├─scta-alibaba              -- springcloud alibaba 微服务体系
│   ├─scta-alibaba-nacos-config  -- nacos 配置中心
├─scta-api-gateway          -- 微服务网关
│   ├─scta-api-apisix            -- apisix 微服务网关
│   ├─scta-api-cloud-gateway     -- springcloud gateway 微服务网关
│   ├─scta-api-kong              -- kong 微服务网关
│   ├─scta-api-netflix-zuul      -- springcloud netflix zuul 微服务网关
│   ├─scta-api-soul              -- soul 微服务网关
├─scta-config-center        -- 微服务分布式配置中心
│   ├─scta-apollo-config         -- apollo 配置中心 
│   ├─scta-consul-config         -- consul 配置中心 
│   ├─scta-etcd-config           -- etcd 配置中心 
│   ├─scta-nacos-config          -- nacos 配置中心 
│   ├─scta-spring-config         -- spring 配置中心 
├─scta-deploy               -- 运维部署
│   ├─scta-deploy-docker         -- docker 运维方式
│   ├─scta-deploy-jenkins        -- jenkins 构建部署
│   ├─scta-deploy-docker         -- test 运维测试
├─scta-monitor              -- 监控平台
│   ├─scta-monitor-actuator      -- actuator 监控平台
│   ├─scta-monitor-admin         -- springboot admin 监控平台
│   ├─scta-monitor-prometheus    -- prometheus 监控平台
│   ├─scta-monitor-sentry        -- sentry 监控平台
├─scta-mq                   -- 分布式消息队列中间件
│   ├─scta-mq-bus                -- 服务总线
│       ├─scta-mq-bus-consul                      -- consul 服务总线
│       ├─scta-mq-bus-kafka                       -- kafka 服务总线
│       ├─scta-mq-bus-rabbitmq                    -- rabbitmq 服务总线
│       ├─scta-mq-bus-rocketmq                    -- rocketmq 服务总线
│   ├─scta-mq-stream             -- 消息队列
│       ├─scta-mq-stream-activemq                 -- activemq 消息队列
│       ├─scta-mq-stream-kafka                    -- kafka 消息队列
│       ├─scta-mq-stream-rabbitmq                 -- rabbitmq 消息队列
│       ├─scta-mq-stream-rocketmq                 -- rocketmq 消息队列
├─scta-netflix              -- springcloud netflix 微服务体系
├─scta-register-center      -- 微服务分布式注册中心
│   ├─scta-register-center-consul                 -- consul 注册中心
│   ├─scta-register-center-etcd                   -- etcd 注册中心
│   ├─scta-register-center-eureka                 -- eureka 注册中心
│   ├─scta-register-center-nacos                  -- nacos 注册中心
│   ├─scta-register-center-zookeeper              -- zookeeper 注册中心
├─scta-service-call         -- 微服务分布式调度
│   ├─scta-service-call-dubbo                     -- dubbo 分布式调度
│   ├─scta-service-call-fegin                     -- fegin 分布式调度
│   ├─scta-service-call-grpc                      -- grpc 分布式调度
│   ├─scta-service-call-ribbon                    -- ribbon 分布式调度
├─scta-service-tolerance     -- 微服务治理熔断降级
│   ├─scta-service-tolerance-hystrix              -- hystix 熔断降级
│   ├─scta-service-tolerance-resilience4j         -- resilience4j 熔断降级
│   ├─scta-service-tolerance-sentinel             -- sentinel 熔断降级
├─scta-trace                 -- 微服务治理链路追踪
│   ├─scta-trace-skywalking                       -- skywalking 链路追踪
│   ├─scta-trace-sleuth                           -- sleuth 链路追踪
├─scta-transaction           -- 微服务分布式事务
│   ├─scta-transaction-seata                      -- seata 分布式事务
├─scta-parent                -- 根依赖管理
├─resource                   -- 资源模块
└─docs                       -- 文档模块
```

## 开发环境
- [x] Java 开发工具包 1.8+
- [x] IDE（Eclipse或IntelliJ IDEA）
- [x] 项目管理工具 Maven

## 规约
**开发规范** 和 **分支管理约定** 见内部文档
[git-flow介绍](https://www.git-tower.com/learn/git/ebook/cn/command-line/advanced-topics/git-flow/)
[gitflow分支说明](http://www.ruanyifeng.com/blog/2012/07/git.html)
[gitflow分支总结](https://juejin.cn/post/6844903634006720526)