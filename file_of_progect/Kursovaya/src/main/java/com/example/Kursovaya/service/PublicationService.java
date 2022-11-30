package com.example.Kursovaya.service;


import com.example.Kursovaya.Repository.ChelovekRepository;
import com.example.Kursovaya.Repository.PostRep;
import com.example.Kursovaya.Repository.ThemesRep;
import com.example.Kursovaya.logic.Post;
import com.example.Kursovaya.logic.Themes;
import com.example.Kursovaya.person.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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

    public Post getById(Long Id){
        return postRep.findById(Id).get();
    }

    public void savePublication(String postName, String news, String comment, String userId){
        Post post=new Post(postName, news, comment, Long.parseLong(userId));
    }
    public void saveNewPublication(){
        postRep.save(new Post());
    }

    public List<Themes> getAllThemes(){return themesRep.findAll();}
}
