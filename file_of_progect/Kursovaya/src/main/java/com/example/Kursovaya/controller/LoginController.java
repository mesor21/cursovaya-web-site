package com.example.Kursovaya.controller;

import com.example.Kursovaya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    UserService userService;
    @GetMapping("/login")
    public String getLoginHTML(){
        return "signin";
    }
}
