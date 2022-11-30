package com.example.Kursovaya.controller.cheafEditor;

import com.example.Kursovaya.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/cheafEditor")
public class ThemesController {
    @Autowired
    PublicationService publicationService;
    @GetMapping("/listThemes")
    public String getListThemes(Model model){
        model.addAttribute("theme",publicationService.getAllThemes());
        return "editortheme";
    }
    @PostMapping("/addTheme")//кнопка будет отправлять запрос для добавления в бд напрямую темы а после возвращять весь список
    public String addTheme(){
        return "redirect:/cheafEditor/listThemes";
    }
}
