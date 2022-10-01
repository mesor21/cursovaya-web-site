package com.example.Kursovaya.person;

import com.example.Kursovaya.logic.Departamtnt;

import java.net.DatagramPacket;

public class Author extends Chelovek{
    protected String jobTitle="Author";
    protected Departamtnt dep4Author;

    public Author(String name, String surename, String email, String pass, String jobTitle, Departamtnt dep4Author) {
        super(name, surename, email, pass);
        this.jobTitle = jobTitle;
        this.dep4Author = dep4Author;
    }
}
