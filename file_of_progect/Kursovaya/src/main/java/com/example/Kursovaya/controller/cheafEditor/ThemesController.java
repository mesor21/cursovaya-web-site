package com.example.Kursovaya.controller.cheafEditor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/cheafEditor")
public class ThemesController {

    @GetMapping("/listThemes")
    public String getAllThemes(){
        return "";
    }
    @PostMapping("/addTheme")//кнопка будет отправлять запрос для добавления в бд напрямую темы а после возвращять весь список
    public String addTheme(){

        return "redirect:/cheafEditor/listThemes";
    }
}
