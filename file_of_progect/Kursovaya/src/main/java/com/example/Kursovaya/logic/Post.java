package com.example.Kursovaya.logic;

import java.util.Date;

public class Post extends Themes implements IPostPublic{
    // To-Do Добавить Тему поста
    private String postName;
    private String news;
    private String comment;

    public Post(String theme, Date deadline, String departament, String postName, String news, String comment) {
        super(theme, deadline, departament);
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
