package com.jilinwula.springcloud.hystrix.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/b")
public class BController {

    @GetMapping("/list")
    public Object list() throws InterruptedException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("b", "b");
        Thread.sleep(3000);
        return map;
    }
}
