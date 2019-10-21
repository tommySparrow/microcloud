hystrix: 熔断器 ---->:熔断器熔断方法参数类型要和原方法保持一致
1.添加依赖
2.启动类上添加注解
@EnableCircuitBreaker
3.控制层添加熔断方法    @HystrixCommand(fallbackMethod = "processHystrix_Get")
书写对应的fallbackMethod方法