package com.example.Kursovaya.controller;

import com.example.Kursovaya.person.CheafEditer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerCheafEditor {

    CheafEditer contr = new CheafEditer();//Данные из аунтификации
    @GetMapping("/listTheme")
    public String listTheme(){
        return "list Theme";
    }

    @GetMapping("/theme")
    public String theme(Long idTheme){
        return "theme"+idTheme;
    }

    @GetMapping("/publicationList")
    public String publication(){
        return "List publication";
    }
}
