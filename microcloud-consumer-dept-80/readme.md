消费模块--消费microcloud-provider-dept-8001提供的服务

实现客户端的负载均衡;
1.服务实例名称 调用:
    1.添加eureka依赖
    2.在启动类上增加
    @EnableEurekaClient
    3.在RestTemplate添加注解
    @LoadBalanced
    如果不加@LoadBalanced 会报错java.net.UnknownHostException: MICROSERVICECLOUD-DEPT
2.ribbon使用(客户端的负载均衡):
    1.添加ribbon依赖
    2.添加注解
    @RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration = {MySelfRule.class})