package com.jilinwula.springcloud.hystrix.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
public class SpringcloudHystrixServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixServiceAApplication.class, args);
    }

    @Bean
    public RestTemplate initRestTemplate() {
        return new RestTemplate();
    }

}
