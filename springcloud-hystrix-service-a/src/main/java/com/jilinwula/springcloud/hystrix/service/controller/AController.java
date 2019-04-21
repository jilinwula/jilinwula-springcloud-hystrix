package com.jilinwula.springcloud.hystrix.service.controller;

import com.jilinwula.springcloud.hystrix.service.service.BService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/a")
@DefaultProperties(defaultFallback = "defaultFallback")
public class AController {

    @Autowired
    private BService bService;

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    @GetMapping("/list")
    public Object list() throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("a", "a");
        map.put("b", bService.list());
//        map.put("b", restTemplate.getForObject("http://127.0.0.1:8081/b/list", String.class));
        return map;
    }

    private Object defaultFallback() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", "-1");
        map.put("msg", "系统异常");
        return map;
    }
}
