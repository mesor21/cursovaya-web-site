package com.example.Kursovaya.controller;

import com.example.Kursovaya.Repository.ChelovekRepository;
import com.example.Kursovaya.Repository.PostRep;
import com.example.Kursovaya.Repository.ThemesRep;
import com.example.Kursovaya.logic.Chelovek;
import com.example.Kursovaya.logic.Post;
import com.example.Kursovaya.logic.Themes;
import com.example.Kursovaya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

@Controller
public class MainPage {
    @Autowired
    PostRep postRep;
    @Autowired
    ThemesRep themesRep;
    @Autowired
    ChelovekRepository chelovekRepository;
    @GetMapping("/")
    public String mainPage(){
        return "mainpage";
    }
    @GetMapping("/post")
    public String getPost(){
        return "post";
    }
}
