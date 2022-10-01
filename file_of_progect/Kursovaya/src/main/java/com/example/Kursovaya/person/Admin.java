package com.example.Kursovaya.person;

import com.example.Kursovaya.logic.Departamtnt;

public class Admin extends Chelovek {
    private String jobTitle = "Admin";

    public Admin(String name, String surename, String email, String pass, String jobTitle) {
        super(name, surename, email, pass);
        this.jobTitle = jobTitle;
    }


    //Departament
    public Departamtnt createDepartament(String depName){
        Departamtnt create = new Departamtnt(depName);
        return create;
    }
    public void editDepartament(Departamtnt edit, String depName){
        Departamtnt edit2 = new Departamtnt(depName);
        edit = edit2;
        edit2=null;
    }



    //CheafEditer
    public CheafEditer createCheafEditer(String name, String surename, String email, String pass){
        CheafEditer create = new CheafEditer(name,surename,email,pass);
        return create;
    }
    public void editCheafEditor(CheafEditer edit,String name, String surename, String email, String pass){
        CheafEditer edit2 = new CheafEditer(name,surename,email,pass);
        edit=edit2;
        edit2=null;
    }

    //DepartmentEditor
    public DepartmentEditor createDepartmentEditor(String name, String surename, String email, String pass, Departamtnt dep4DepEditor){
        DepartmentEditor create = new DepartmentEditor(name, surename, email, pass,dep4DepEditor);
        return create;
    }
    public void editDepartmentEditor(DepartmentEditor edit,String name, String surename, String email, String pass, Departamtnt dep4DepEditor){
        DepartmentEditor edit2 = new DepartmentEditor(name, surename, email, pass, dep4DepEditor);
        edit=edit2;
        edit2=null;
    }

    //Author create and edit
    public Author createAuthor(String name, String surename, String email, String pass, Departamtnt dep4Author){
        Author create = new Author(name, surename, email, pass, dep4Author);
        return create;
    }
    public void editAuthor(Author edit, String name, String surename, String email, String pass, Departamtnt dep4Author){
        Author edit2 = new Author(name, surename, email, pass, dep4Author);
        edit = edit2;
        edit2=null;
    }
}
