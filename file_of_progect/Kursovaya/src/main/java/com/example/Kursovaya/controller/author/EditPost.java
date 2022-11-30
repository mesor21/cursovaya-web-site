package com.example.Kursovaya.controller.author;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/author")
public class EditPost {
    @GetMapping("/{id}")
    public String editPostByAuthor(@PathVariable("id")String id, Model model){
        model.addAttribute();
        return "";
    }
}
