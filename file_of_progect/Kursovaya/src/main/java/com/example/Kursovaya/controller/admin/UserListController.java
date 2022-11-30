package com.example.Kursovaya.controller.admin;

import com.example.Kursovaya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class UserListController {
    @Autowired
    UserService userService;
    @GetMapping("/userList")//Дописать вывод листа, ток хз как
    public String getList(Model model){
        model.addAttribute("allUsers", userService.getAllUsers());
        return "adminpanel";
    }
}
