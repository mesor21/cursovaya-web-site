package com.example.Kursovaya.logic;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Themes{
    private @Id @GeneratedValue Long id;
    private String theme;
    private Date deadline;
    private String departament;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Post post;
    public void setPost(Post post) {
        this.post = post;
    }
    public Post getPost() {
        return post;
    }


    public Themes(){}
    public Themes(String theme, Date deadline, String departament) {
        this.theme = theme;
        this.deadline = deadline;
        this.departament = departament;
    }
    public String getTheme() {
        return theme;
    }
    public Date getDeadline() {
        return deadline;
    }
    public String getDepartament() {
        return departament;
    }
}
