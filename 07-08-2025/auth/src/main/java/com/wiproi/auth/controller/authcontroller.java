package com.wiproi.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class authcontroller {
    @GetMapping("/greet")
    public String greet() {
        return "Hello from narendra";
    }


}
