package com.example.Kursovaya.controller.admin;

import com.example.Kursovaya.logic.Chelovek;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class EditUser {
    @GetMapping("/editUser/{id}")
    public String editUser(@PathVariable("id")String id){

        return "adduser";
    }
}
