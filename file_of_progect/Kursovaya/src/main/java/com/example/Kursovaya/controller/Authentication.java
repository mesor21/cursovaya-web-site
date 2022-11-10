package com.example.Kursovaya.controller;

<<<<<<< HEAD
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
/*

@SpringBootApplication
public class Authentication {
    @PostMapping("/Aunth")

}
*/
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Authentication {

    @GetMapping("/auth")
    public String auth(){
        return "simple_request.html";
    }
    @PostMapping("")
    public String login(){
        return "admin.html";
    }
}
>>>>>>> parent of 2d40216 (test)
