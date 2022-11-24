
package com.example.Kursovaya.person;

import com.example.Kursovaya.logic.Chelovek;
import com.example.Kursovaya.logic.Departament;
import com.example.Kursovaya.logic.Post;
import com.example.Kursovaya.logic.Role;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Author extends Chelovek {
    public void editPost(Post p,String news){
        p.setNews(news);
    }

    public Author(){}

}