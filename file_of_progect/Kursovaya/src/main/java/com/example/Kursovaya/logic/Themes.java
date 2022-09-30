package com.example.Kursovaya.logic;
import java.util.Date;

public class Themes {
    private String themes;
    private Date daedline;
    private String departament;
    public Themes(){};
    public Themes(String themes, Date daedline, String departament) {
        this.themes = themes;
        this.daedline = daedline;
        this.departament=departament;
    }

    public String getThemes() {
        return themes;
    }

    public Date getDaedline() {
        return daedline;
    }

    public String getDepartament() {
        return departament;
    }
}
