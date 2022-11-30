package com.example.Kursovaya.controller.departmentEditor;

import com.example.Kursovaya.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departmentEditor")
public class VeiwThemes {
    @Autowired
    PublicationService publicationService;
    @GetMapping("/listThemes")
    public String getListThemes(Model model){
        model.addAttribute("theme",publicationService.getAllThemes());
        return "departmentEditorTheme";
    }
    //нужен ещё один темплейт
}
