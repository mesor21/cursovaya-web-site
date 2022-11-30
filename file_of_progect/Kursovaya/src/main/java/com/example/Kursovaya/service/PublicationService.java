package com.example.Kursovaya.service;


import com.example.Kursovaya.Repository.ChelovekRepository;
import com.example.Kursovaya.Repository.PostRep;
import com.example.Kursovaya.Repository.ThemesRep;
import com.example.Kursovaya.logic.Post;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PublicationService {
    @Autowired
    PostRep postRep;
    @Autowired
    ThemesRep themesRep;
    @Autowired
    ChelovekRepository chelovekRepository;

    public List<Post> getAllPostByEmail(String email){
        return postRep.findByAuthorID(chelovekRepository.findByEmail(email).getId());
    }
    public List<Post> getAllPost(){
        return postRep.findAll();
    }
}
