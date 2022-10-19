package com.example.Kursovaya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Authentication {

    @GetMapping("/auth")
    public String auth(){
        return "simple_request.html";
    }
    @PostMapping("")
    public String login(){
        return "admin.html";
    }
}
