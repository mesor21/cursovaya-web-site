package com.example.Kursovaya.person;

import com.example.Kursovaya.logic.Departament;
import com.example.Kursovaya.logic.Post;
import com.example.Kursovaya.logic.Themes;

public class DepartmentEditor extends Chelovek{

    public Post createPost(Themes them, Author x, String postname, String comment){
        Post createPost = new Post(postname, "", comment);
        return createPost;
    }

    //to-do edit post
    public void editPost(Post edit,Themes them, Author x, String postname, String news, String comment){
        Post edit2 = new Post(postname, news,comment);
        edit = edit2;
        edit2=null;
    }

    public DepartmentEditor(){}
    public DepartmentEditor(String name, String surename, String email, String pass, Departament dep4DepEditor) {
        super(name, surename, email, pass, "Department Editor");
    }
}
