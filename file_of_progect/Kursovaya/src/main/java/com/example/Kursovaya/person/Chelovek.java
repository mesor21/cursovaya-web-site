package com.example.Kursovaya.person;

public class Chelovek implements IChelovek, IChelovekAuntenth{
    private String name;
    private String surename;
    private String email;
    private String pass;
    private String jobTitle;

    public Chelovek(String name, String surename, String email, String pass, String jobTitle) {
        this.name = name;
        this.surename = surename;
        this.email = email;
        this.pass = pass;
        this.jobTitle = jobTitle;
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
}
