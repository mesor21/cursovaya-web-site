package com.example.Kursovaya.controller;

import com.example.Kursovaya.logic.Departament;
import com.example.Kursovaya.person.DepartmentEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerDepartmentEditor {

    DepartmentEditor contr = new DepartmentEditor();
    @GetMapping("/listTheme")
    public String listTheme(){
        return "list Theme";
    }
    @GetMapping("/publicationList")
    public String publicationList(){
        return "List publication";
    }
    @GetMapping("/publication")
    public String publication(Long idPublication){
        return "publication" + idPublication;
    }
}
