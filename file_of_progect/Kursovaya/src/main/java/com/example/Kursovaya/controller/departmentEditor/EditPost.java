package com.example.Kursovaya.controller.departmentEditor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departmentEditor")
public class EditPost {
    @GetMapping("/{id}")
    public String editPostByDepartmentEditor(@PathVariable("id")String id, Model model){
        model.addAttribute();
        return "";
    }
}
