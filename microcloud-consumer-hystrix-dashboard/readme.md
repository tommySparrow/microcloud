hystrix-dashboard监控模块

注意:使用该功能需要被监测的模块一如依赖
        <!-- actuator -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
现在仅明白客户端使用IP+端口方式调用服务端的监控--http://localhost:8001/hystrix.stream