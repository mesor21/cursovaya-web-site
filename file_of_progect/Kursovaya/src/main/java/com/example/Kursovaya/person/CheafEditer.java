package com.example.Kursovaya.person;

import com.example.Kursovaya.logic.Themes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheafEditer{

    public Themes createThemes(String theme, String deadline, String departament){
        String pattern = "HH:mm dd.MM.yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        Date dead=new Date();
        try {
            dead = dateFormat.parse(deadline);
        }
        catch (ParseException e){e.printStackTrace();}
        Themes tem = new Themes(theme,dead,departament);
        return tem;
    }

    public void editThemes(Themes x,String theme, String deadline, String departament){
        String pattern = "HH:mm dd.MM.yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        Date dead=new Date();
        try {
            dead = dateFormat.parse(deadline);
        }
        catch (ParseException e){e.printStackTrace();}
        Themes tem = new Themes(theme,dead,departament);
        x=tem;
        tem=null;
    }

    public CheafEditer() {}
}
