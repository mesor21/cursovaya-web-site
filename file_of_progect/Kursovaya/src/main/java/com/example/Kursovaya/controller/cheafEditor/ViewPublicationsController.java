package com.example.Kursovaya.controller.cheafEditor;

import com.example.Kursovaya.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cheafEditor")
public class ViewPublicationsController {
    //отправлять страницу такую же как у автора но переименовать правый верхний
    @Autowired
    PublicationService publicationService;
    @GetMapping("/listPublications")
    public String getListPublications(Model model){
        model.addAttribute("post", publicationService.getAllPost());
        return "listPublication";
    }

}
