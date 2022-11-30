package com.example.Kursovaya.controller.author;

import com.example.Kursovaya.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/author")
public class AuthorPublication {
    @Autowired
    PublicationService publicationService;
    @GetMapping("/listAllPublications")
    public String getListPublications(Model model){
        model.addAttribute("post", publicationService.getAllPost());
        return "authorpanel";
    }

    @GetMapping("/editPost/{id}")
    public String editPostByUser(@PathVariable("id")String id, Model model){
        model.addAttribute("id",id);
        return "";
    }

    public String get(@RequestParam(value = "postName",required = false)String postName, @RequestParam(value = "news",required = false)String news, @RequestParam(value = "comment",required = false)String comment, @RequestParam(value = "userId",required = false)String userId){
        publicationService.savePublication(postName,news,comment,userId);
        return "redirect:/author/listAllPublications";
    }
}
