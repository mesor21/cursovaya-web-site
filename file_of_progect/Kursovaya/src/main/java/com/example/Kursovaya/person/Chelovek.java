package com.example.Kursovaya.person;

public class Chelovek implements IChelovek, IChelovekAuntenth{
    private String name;
    private String surename;
    private String email;
    private String pass;

    public Chelovek() {
    }

    public Chelovek(String name, String surename, String email, String pass) {
        this.name = name;
        this.surename = surename;
        this.email = email;
        this.pass = pass;
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
