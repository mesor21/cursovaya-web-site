package com.example.Kursovaya.person;

import com.example.Kursovaya.logic.Departament;

public class Admin extends Chelovek {
    public Admin(){}
    public Admin(String name, String surename, String email, String pass) {
        super(name, surename, email, pass, "Admin");
    }


    //Departament
    public Departament createDepartament(String depName){
        Departament create = new Departament(depName);
        return create;
    }
    public void editDepartament(Departament edit, String depName){
        Departament edit2 = new Departament(depName);
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
    public DepartmentEditor createDepartmentEditor(String name, String surename, String email, String pass, Departament dep4DepEditor){
        DepartmentEditor create = new DepartmentEditor(name, surename, email, pass,dep4DepEditor);
        return create;
    }

    public void editDepartmentEditor(DepartmentEditor edit,String name, String surename, String email, String pass, Departament dep4DepEditor){
        DepartmentEditor edit2 = new DepartmentEditor(name, surename, email, pass, dep4DepEditor);
        edit=edit2;
        edit2=null;
    }

    //Author create and edit
    public Author createAuthor(String name, String surename, String email, String pass){
        Author create = new Author(name, surename, email, pass);
        return create;
    }
    public void editAuthor(Author edit, String name, String surename, String email, String pass){
        Author edit2 = new Author(name, surename, email, pass);
        edit = edit2;
        edit2=null;
    }
}
