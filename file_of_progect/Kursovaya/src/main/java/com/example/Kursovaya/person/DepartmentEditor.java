package com.example.Kursovaya.person;

import com.example.Kursovaya.logic.Chelovek;
import com.example.Kursovaya.logic.Post;
import com.example.Kursovaya.logic.Themes;

public class DepartmentEditor extends Chelovek {

    public Post createPost(Themes them, Author x, String postname, String comment){
        Post createPost = new Post(postname, "", comment, x.getId());
        return createPost;
    }

    //to-do edit post
    public void editPost(Post edit,Themes them, Author x, String postname, String news, String comment){
        Post edit2 = new Post(postname, news,comment, x.getId());
        edit = edit2;
        edit2=null;
    }

    public DepartmentEditor(){
    }
}
