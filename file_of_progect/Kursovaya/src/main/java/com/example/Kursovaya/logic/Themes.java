package com.example.Kursovaya.logic;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

@Entity
public class Themes{
    private @Id @GeneratedValue Long id;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "them")
    private Set<Post> user;
    private String theme;
    private Date deadline;
    private String departament;
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
    public String getStringDeadline(){
        DateFormat date_format = new SimpleDateFormat("yyyy-mm-dd");
        return date_format.format(deadline);
    }
    public String getDepartament() {
        return departament;
    }

}
