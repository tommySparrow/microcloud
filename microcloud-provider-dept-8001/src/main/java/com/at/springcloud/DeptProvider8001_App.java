package com.at.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ EnableEurekaClient 使EurekaClient可以注册进服务列表
 * @ EnableDiscoveryClient //服务发现
 * @author User
 */
@SpringBootApplication
@MapperScan(value = "com.at.springcloud.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8001_App {
    public static void main( String[] args ){
        SpringApplication.run(DeptProvider8001_App.class,args);
    }
}
