package org.example.teknologidemo.controllers;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {
//hejjj
    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }
}
