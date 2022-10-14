package com.example.Kursovaya.person;

import com.example.Kursovaya.logic.Post;


public class Author extends Chelovek {
    public void editPost(Post p,String news){
        p.setNews(news);
    }

    public Author(String name, String surename, String email, String pass) {
        super(name, surename, email, pass, "Author");
    }

}
