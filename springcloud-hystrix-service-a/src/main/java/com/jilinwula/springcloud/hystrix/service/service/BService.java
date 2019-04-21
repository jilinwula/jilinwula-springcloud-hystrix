package com.jilinwula.springcloud.hystrix.service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "springcloud-hystrix-service-b")
public interface BService {
    @GetMapping("/b/list")
    String list();
}
