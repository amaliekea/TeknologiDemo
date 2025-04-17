package org.example.teknologidemo.controllers;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//hej
@SpringBootApplication
@RestController
public class HelloApplication {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }
}
