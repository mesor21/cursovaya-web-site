package com.example.Kursovaya.controller.departmentEditor;

import com.example.Kursovaya.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departmentEditor")
public class Publication {
    @Autowired
    PublicationService publicationService;

    @GetMapping("/listPublications")
    public String getListPublications(Model model){
        model.addAttribute("depEditor", publicationService.getAllPost());
        return "editorpublicarions";
    }

    @PostMapping("/publication")
    public String hi(){
        return "redirect:/listPublications";
    }


}
