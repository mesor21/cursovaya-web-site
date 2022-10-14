package com.example.Kursovaya.controller;

import com.example.Kursovaya.person.Chelovek;
import com.example.Kursovaya.person.ChelovekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    private final ChelovekRepository chelRep;
    @Autowired
    public TestController(ChelovekRepository chelRep){
        this.chelRep = chelRep;
    }
    @GetMapping("/test")
    public String testNewChel(){
        chelRep.save(new Chelovek("Dima","M","123@21.3","567","admin") );
        chelRep.deleteAll();
        return "It worked!";
    }
}
