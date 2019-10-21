package com.at.springcloud;

import com.at.springcloud.myRibbonRule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * defaultConfiguration 在feign中定义自己的负载均衡规则
 * EnableFeignClients  //作用于feign扫描
 * feign
 * @author jerry
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.at.springcloud"},defaultConfiguration = {MySelfRule.class})
public class DeptConsumer80_Feign_App {

    public static void main( String[] args ) {
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }
}
