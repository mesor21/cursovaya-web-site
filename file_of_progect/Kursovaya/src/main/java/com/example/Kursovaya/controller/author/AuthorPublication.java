package com.example.Kursovaya.controller.author;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/author")
public class AuthorPublication {
    @GetMapping("/listAllPublications")
    public String getListPublications(){
        
        return "";
    }
}
