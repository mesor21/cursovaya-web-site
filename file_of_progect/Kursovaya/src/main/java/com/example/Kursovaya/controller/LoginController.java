package com.example.Kursovaya.controller;

import com.example.Kursovaya.logic.Repository.ChelovekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    private ChelovekRepository userRepo;

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/login")
    public String chekLog(/*Chelovek user*/)
    {
        /*Chelovek x=new Chelovek("Dima","M","menzdd21@gmail.com","12345","admin",null);
        userRepo.equals(x);
        Chelovek userFromDb = userRepo.findByEmail(user.getEmail());
        if(userFromDb.getPass().equals(user.getPass())){
            return "admin";
        }*/
        return "redirect:/login";
    }
}
