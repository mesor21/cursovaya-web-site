package com.example.Kursovaya.controller.admin;

import com.example.Kursovaya.logic.Chelovek;
import com.example.Kursovaya.person.Admin;
import com.example.Kursovaya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class EditUser {
    @Autowired
    UserService userService;

    @GetMapping("/editUser/{id}")
    public String editUser(@PathVariable("id")String id, Model model){
        model.addAttribute("id", id);
        model.addAttribute("allUsers", userService.getUserById(Long.parseLong(id)));
        return "adduser";
    }

    @PostMapping("/editUser")
    public String saveEdit(@RequestParam(value = "id",required = false)String id,@RequestParam(value = "fio",required = false)String surename, @RequestParam(value = "email",required = false)String email, @RequestParam(value = "password",required = false)String password, @RequestParam(value = "role",required = false)String role){
        Admin admin =new Admin();
        if(role.equals("Admin")){
            userService.saveUser(admin.editAdmin(userService.getUserById(Long.parseLong(id)).get(), "", surename, email,password));
        }
        if(role.equals("Cheaf Editor")){
            userService.saveUser(admin.editCheafEditor(userService.getUserById(Long.parseLong(id)).get(), "", surename, email,password));
        }
        if(role.equals("Department Editor")){
            userService.saveUser(admin.editDepartmentEditor(userService.getUserById(Long.parseLong(id)).get(), "", surename, email,password, null));
        }
        if(role.equals("Author")){
            userService.saveUser(admin.editAuthor(userService.getUserById(Long.parseLong(id)).get(), "", surename, email,password, null));
        }
        return "redirect:/admin/userList";
    }
}
