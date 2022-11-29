package com.example.Kursovaya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    /*@Autowired
    UserService service;*/
    //"login/styles_login.css"
    //"login/usericon.icns"

    @GetMapping("/login")
    public String getLoginHTML(){
        return "signin";
    }

    /*@PostMapping("/login")
    public String chekLog(*//*Chelovek user*//*)
    {
        *//*
        userRepo.equals(x);
        Chelovek userFromDb = userRepo.findByEmail(user.getEmail());
        if(userFromDb.getPass().equals(user.getPass())){
            return "admin";
        }*//*
        return "redirect:/login";
    }*/

}
