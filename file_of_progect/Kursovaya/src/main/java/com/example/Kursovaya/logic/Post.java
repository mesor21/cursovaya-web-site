package com.example.Kursovaya.logic;

import java.util.Date;
import java.util.UUID;

public class Post implements IPostPublic{
    // To-Do Добавить Тему поста
    private Themes theme;
    private String postName;
    private String news;
    private String comment;

    public Post(Themes theme, String postName, String news, String comment) {
        this.theme= theme;
        this.postName = postName;
        this.news = news;
        this.comment = comment;
    }
    public Themes getTheme(){
        return theme;
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
