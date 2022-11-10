package com.example.Kursovaya.controller;

import com.example.Kursovaya.person.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class controllerAdmin {

    Admin contr = new Admin();//Данные из аунтификации
    @GetMapping("/userList")
    public String users(){
        return "UserList";
    };
    @GetMapping("/userlist/add")
    public String addUser(){
        return "add User";
    }

    @GetMapping("/department")
    public String departmentList(){
        return "dep lis";
    }

}
