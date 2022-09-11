package com.example.hellospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("welcome")
    public String welcome(@RequestParam(value = "name", defaultValue = "Spring Boot") String name){
        return "Hello, " + name;
    }
}
