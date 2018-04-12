package com.bugatti.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
public class WelcomeController {
    private String message = "你好";


    @GetMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date().getTime());
        model.put("message", this.message);
        return "welcome";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
