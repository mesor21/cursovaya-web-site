
package com.example.Kursovaya.person;

import com.example.Kursovaya.logic.Chelovek;
import com.example.Kursovaya.logic.Post;


public class Author extends Chelovek {
    public void editPost(Post p,String news){
        p.setNews(news);
    }

    public Author(){}

}