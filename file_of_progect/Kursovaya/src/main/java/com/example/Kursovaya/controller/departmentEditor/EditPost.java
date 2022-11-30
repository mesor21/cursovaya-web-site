package com.example.Kursovaya.controller.departmentEditor;

import com.example.Kursovaya.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/departmentEditor")
public class EditPost {
    @Autowired
    PublicationService publicationService;
    @GetMapping("/editPost/{id}")
    public String editParam(@PathVariable("id")String id,Model model){
        model.addAttribute("id",id);
        return "editorpublication";
    }
    @PostMapping()
    public String get(@RequestParam(value = "postName",required = false)String postName, @RequestParam(value = "news",required = false)String news, @RequestParam(value = "comment",required = false)String comment, @RequestParam(value = "userId",required = false)String userId){
        publicationService.savePublication(postName,news,comment,userId);
        return "redirect:/departmentEditor/listPublications";
    }
}
