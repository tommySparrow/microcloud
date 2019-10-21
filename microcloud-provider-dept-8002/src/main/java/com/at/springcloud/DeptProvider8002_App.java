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
public class DeptProvider8002_App {
    public static void main( String[] args ){
        SpringApplication.run(DeptProvider8002_App.class,args);
    }
}
