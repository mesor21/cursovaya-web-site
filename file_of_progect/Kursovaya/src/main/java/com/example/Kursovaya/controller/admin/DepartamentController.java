package com.example.Kursovaya.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class DepartamentController {
    @GetMapping("/")
    public String getDepController(){
        return "";
    }
}
