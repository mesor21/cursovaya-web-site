package com.example.Kursovaya.person;

import com.example.Kursovaya.logic.Departamtnt;

public class DepartmentEditor extends Chelovek{
    protected String post="Department Editor";
    protected Departamtnt dep4DepEditor;

    public DepartmentEditor(String name, String surename, String email, String pass, String jobTitle, String post, Departamtnt dep4DepEditor) {
        super(name, surename, email, pass);
        this.post = post;
        this.dep4DepEditor = dep4DepEditor;
    }
}
