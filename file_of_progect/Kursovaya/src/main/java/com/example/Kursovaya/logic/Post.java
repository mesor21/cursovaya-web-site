package com.example.Kursovaya.logic;

import java.util.Date;

public class Post extends Themes implements IPostPublic{
    // To-Do Добавить Тему поста
    private String postName;
    private String news;
    private String comment;

    public Post(String theme, Date daedline, String departament, String postName, String news, String comment) {
        super(theme, daedline, departament);
        this.postName = postName;
        this.news = news;
        this.comment = comment;
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
