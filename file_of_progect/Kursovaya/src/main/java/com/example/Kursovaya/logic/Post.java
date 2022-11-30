package com.example.Kursovaya.logic;

import javax.persistence.*;

@Entity
public class Post{
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Themes them;
    // To-Do Добавить Тему поста
    private @Id @GeneratedValue Long id;

    public Post(String postName, String news, String comment, Long authorID) {
        this.postName = postName;
        this.news = news;
        this.comment = comment;
        this.authorID = authorID;
    }

    private String postName;
    private String news;
    private String comment;
    private Long authorID;
    public Post(){}


    public void setNews(String news) {
        this.news = news;
    }

    public String getPostName() {
        return postName;
    }

    public String getPostNews() {
        return news;
    }

    public String getPostComment() {
        return comment;
    }

    public Long getAuthorID() {
        return authorID;
    }

    public Themes getThem(){
        return them;
    }
}
