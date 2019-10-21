feign消费模块--消费microcloud-provider-dept-feign-8003提供的服务
@EnableFeignClients(basePackages= {"com.at.springcloud"},defaultConfiguration = {MySelfRule.class})-defaultConfiguration在feign中定义自己的负载均衡规则
