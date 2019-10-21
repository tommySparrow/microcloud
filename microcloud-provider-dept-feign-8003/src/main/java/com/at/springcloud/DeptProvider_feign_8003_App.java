package com.at.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author User
 */
@SpringBootApplication
@MapperScan(value = "com.at.springcloud.mapper")
@EnableEurekaClient
public class DeptProvider_feign_8003_App {
    public static void main( String[] args ){
        SpringApplication.run(DeptProvider_feign_8003_App.class,args);
    }
}
