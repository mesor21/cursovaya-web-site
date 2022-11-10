package com.example.Kursovaya.logic;

import com.example.Kursovaya.person.IChelovek;
import com.example.Kursovaya.person.IChelovekAuntenth;

import javax.persistence.*;

@Entity
public class Chelovek implements IChelovek, IChelovekAuntenth {
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})

    private Departament departament;
    private @Id @GeneratedValue Long id;
    private String name;
    private String surename;
    private String email;
    private String pass;
    private String jobTitle;

    public Chelovek(){}

    public Chelovek(String name, String surename, String email, String pass, String jobTitle, Departament departament) {
        this.name = name;
        this.surename = surename;
        this.email = email;
        this.pass = pass;
        this.jobTitle = jobTitle;
        this.departament=departament;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurename() {
        return surename;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPass() {
        return pass;
    }

    @Override
    public String getJobTitle(){
        return jobTitle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Departament getDep() {
        return departament;
    }
    public void setDep(Departament departament) {
        this.departament = departament;
    }

    public Long getId() {
        return id;
    }

}
