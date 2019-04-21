package com.jilinwula.springcloud.hystrix.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudHystrixServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixServiceBApplication.class, args);
    }

}
