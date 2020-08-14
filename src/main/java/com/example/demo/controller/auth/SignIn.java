package com.example.demo.auth;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class SignIn {
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
}