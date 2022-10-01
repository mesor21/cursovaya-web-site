package com.example.Kursovaya.person;

import com.example.Kursovaya.logic.Departamtnt;
import com.example.Kursovaya.logic.Post;
import com.example.Kursovaya.logic.Themes;

public class DepartmentEditor extends Chelovek{
    private String jobTitle="Department Editor";
    private Departamtnt dep4DepEditor;

    public Post createPost(Themes them, Author x, String postname, String comment){
        Post createPost = new Post(them.getTheme(), them.getDeadline(), them.getDepartament(), postname, "", comment);
        return createPost;
    }

    //to-do edit post
    public void editPost(Post edit,Themes them, Author x, String postname, String news, String comment){
        Post edit2 = new Post(them.getTheme(), them.getDeadline(),them.getDepartament(), postname, news,comment);
        edit = edit2;
        edit2=null;
    }


    public DepartmentEditor(String name, String surename, String email, String pass, Departamtnt dep4DepEditor) {
        super(name, surename, email, pass);
        this.dep4DepEditor = dep4DepEditor;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Departamtnt getDep4DepEditor() {
        return dep4DepEditor;
    }
}
