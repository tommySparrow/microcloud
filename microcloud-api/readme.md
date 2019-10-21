公用模块

客户端的hystrix:
1.在公用接口上增加fallbackFactory=DeptClientServiceFallbackFactory.class
2.在microcloud-consumer-dept-feign的.yml文件中添加
feign:
  hystrix:
    enabled: true
