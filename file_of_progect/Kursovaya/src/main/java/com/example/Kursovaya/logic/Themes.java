package com.example.Kursovaya.logic;
import java.util.Date;

public class Themes{
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
    public String getDepartament() {
        return departament;
    }
}
