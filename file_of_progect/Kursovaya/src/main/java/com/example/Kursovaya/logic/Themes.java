package com.example.Kursovaya.logic;
import java.util.Date;

public class Themes{
    private String theme;
    private Date daedline;
    private String departament;

    public Themes(String theme, Date daedline, String departament) {
        this.theme = theme;
        this.daedline = daedline;
        this.departament = departament;
    }

    public String getTheme() {
        return theme;
    }

    public Date getDaedline() {
        return daedline;
    }

    public String getDepartament() {
        return departament;
    }
}
