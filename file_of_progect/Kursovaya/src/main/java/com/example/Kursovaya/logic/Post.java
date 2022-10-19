package com.example.Kursovaya.logic;

import javax.persistence.*;

@Entity
public class Post implements IPostPublic{
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Themes them;
    // To-Do Добавить Тему поста
    private @Id @GeneratedValue Long id;
    private String postName;
    private String news;
    private String comment;
    public Post(){}
    public Post(String postName, String news, String comment) {
        this.postName = postName;
        this.news = news;
        this.comment = comment;
    }
    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public String getPostName() {
        return postName;
    }
    @Override
    public String getPostNews() {
        return news;
    }

    public String getPostComment() {
        return comment;
    }
}
