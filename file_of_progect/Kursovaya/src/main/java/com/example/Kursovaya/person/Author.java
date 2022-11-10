package com.example.Kursovaya.person;

import com.example.Kursovaya.logic.Departament;
import com.example.Kursovaya.logic.Post;

public class Author extends Chelovek{
    private Departament dep4Author;

    public void editPost(Post p,String news){
        p.setNews(news);
    }
<<<<<<< HEAD

    public Author(String name, String surename, String email, String pass, Departament dep4Author) {
        super(name, surename, email, pass, "Author");
        this.dep4Author = dep4Author;
    }

    public Departament getDep4Author() {
        return dep4Author;
    }
=======
    public Author(){}

>>>>>>> parent of 2d40216 (test)
}
