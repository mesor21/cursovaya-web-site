package com.example.Kursovaya.controller;

import com.example.Kursovaya.person.Author;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerAuthor {
    Author contr = new Author();//Данные из аунтификации
    @GetMapping("/publicationList")
    public String publicationList(){
        return "List publication";
    }

    @GetMapping("/publication")
    public String publication(Long idPublication){
        return "publication" + idPublication;
    }

}
