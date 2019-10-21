服务提供模块8001

 访问 status的地址显示/info信息步骤;
        1.在父工程添加
           <build>
                   <finalName>microservicecloud</finalName>
                   <resources>
                       <resource>
                           <directory>src/main/resources</directory>
                           <filtering>true</filtering>
                       </resource>
                   </resources>
                   <plugins>
                       <plugin>
                           <groupId>org.apache.maven.plugins</groupId>
                           <artifactId>maven-resources-plugin</artifactId>
                           <configuration>
                               <delimiters>
                                   <delimit>$</delimit>
                               </delimiters>
                           </configuration>
                       </plugin>
                   </plugins>
               </build>
        2.在provider(客户端)做以下操作:
            1.添加依赖
                <!-- actuator监控信息完善(显示eureka /info信息) -->
                       <dependency>
                           <groupId>org.springframework.boot</groupId>
                           <artifactId>spring-boot-starter-actuator</artifactId>
                       </dependency>
                       
                2.application.yml 文件添加:
                    info:
                      app.name: microservicecloud
                      company.name: www.baidu.com
                      build.artifactId: $project.artifactId$
                      build.version: $project.version$
                      
服务发现:
        1.启动类注解:@EnableDiscoveryClient
        2.注入类:
            @Autowired
            private DiscoveryClient client;
        3.写相关代码
        