package com.jilinwula.springcloud.hystrix.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudHystrixEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixEurekaApplication.class, args);
    }

}
