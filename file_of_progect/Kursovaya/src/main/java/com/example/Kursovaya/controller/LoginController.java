package com.example.Kursovaya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    /*@Autowired
    UserService service;*/
    //"login/styles_login.css"
    //"login/usericon.icns"

    @GetMapping("/login")
    public String getLoginHTML(){
        return "vhod";
    }

    /*@PostMapping("/login")
    public String chekLog(*//*Chelovek user*//*)
    {
        *//*Chelovek x=new Chelovek("Dima","M","menzdd21@gmail.com","12345","admin",null);
        userRepo.equals(x);
        Chelovek userFromDb = userRepo.findByEmail(user.getEmail());
        if(userFromDb.getPass().equals(user.getPass())){
            return "admin";
        }*//*
        return "redirect:/login";
    }*/
}
