package com.example.Kursovaya.logic;

import javax.persistence.*;

@Entity
public class Chelovek{
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})

    private Departament departament;

    private String roles;
    private @Id @GeneratedValue Long id;
    private String name;
    private String surename;
    private String email;
    private String pass;
    private String jobTitle;

    public Chelovek(){}

    public Chelovek(String name, String surename, String email, String pass, String roles, Departament departament){
        this.name = name;
        this.surename = surename;
        this.email = email;
        this.pass = pass;
        this.roles=roles;
        this.departament=departament;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getRoles() {
        return roles;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

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
