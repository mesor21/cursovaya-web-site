
package com.example.Kursovaya.person;

import com.example.Kursovaya.logic.Chelovek;
import com.example.Kursovaya.logic.Departament;
import com.example.Kursovaya.logic.Post;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Author extends Chelovek {
    public void editPost(Post p,String news){
        p.setNews(news);
    }

    public Author(){}
    public Author(String name, String surename, String email, String pass, Departament dep4author) {
        super(name, surename, email, pass, "author", dep4author);
    }

}