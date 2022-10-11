package com.example.Kursovaya.logic;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Post implements IPostPublic{
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "post")
    private Set<Themes> them;

    public void setThem(Set<Themes> them) {
        this.them = them;
    }

    public Set<Themes> getThem() {
        return them;
    }

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

    public Long getId() {
        return id;
    }
}
