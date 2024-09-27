package com.genpiper.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/message")
    public String getMessage() {
        return "Greetings from Spring Boot! Hello World";
    }
}
