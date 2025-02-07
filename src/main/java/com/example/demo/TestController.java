package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 触发热部署测试
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
