package com.example.Kursovaya.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserListController {
    @GetMapping("/admin/UserList")//Дописать вывод листа, ток хз как
    public String getList(){
        return "adminTest";
    }
}
