package com.example.Kursovaya.person;

import com.example.Kursovaya.logic.Chelovek;
import com.example.Kursovaya.logic.Departament;

public class Admin{
    public Admin(){}

    //Departament
    public Departament createDepartament(String depName){
        Departament create = new Departament(depName);
        return create;
    }
    public Departament editDepartament(Departament edit, String depName){
        Departament edit2 = new Departament(depName);
        edit = edit2;
        edit2=null;
        return edit;
    }

    //Admin
    public Chelovek createAdmin(String name, String surename, String email, String pass){
        Chelovek create = new Chelovek(name,surename,email,pass,"Admin", null);
        return create;
    }
    public Chelovek editAdmin(Chelovek edit,String name, String surename, String email, String pass){
        if(name.equals("")){
            name = edit.getName();
        }
        if(surename.equals("")){
            surename = edit.getSurename();
        }
        if(email.equals("")){
            email = edit.getEmail();
        }
        if(pass.equals("")){
            pass = edit.getPass();
        }
        Chelovek edit2 = new Chelovek(name,surename,email,pass,"Admin", null);
        edit=edit2;
        edit2=null;
        return edit;
    }

    //CheafEditer
    public Chelovek createCheafEditer(String name, String surename, String email, String pass){
        Chelovek create = new Chelovek(name,surename,email,pass,"Cheaf Editor", null);
        return create;
    }
    public Chelovek editCheafEditor(Chelovek edit,String name, String surename, String email, String pass){
        if(name.equals("")){
            name = edit.getName();
        }
        if(surename.equals("")){
            surename = edit.getSurename();
        }
        if(email.equals("")){
            email = edit.getEmail();
        }
        if(pass.equals("")){
            pass = edit.getPass();
        }
        Chelovek edit2 = new Chelovek(name,surename,email,pass,"Cheaf Editor", null);
        edit=edit2;
        edit2=null;
        return edit;
    }

    //DepartmentEditor
    public Chelovek createDepartmentEditor(String name, String surename, String email, String pass, Departament dep4DepEditor){
        Chelovek create = new Chelovek(name, surename, email, pass,"Department Editor",dep4DepEditor);
        return create;
    }

    public Chelovek editDepartmentEditor(Chelovek edit,String name, String surename, String email, String pass, Departament dep4DepEditor){
        if(name.equals("")){
            name = edit.getName();
        }
        if(surename.equals("")){
            surename = edit.getSurename();
        }
        if(email.equals("")){
            email = edit.getEmail();
        }
        if(pass.equals("")){
            pass = edit.getPass();
        }
        Chelovek edit2 = new Chelovek(name, surename, email, pass, "Department Editor", dep4DepEditor);
        edit=edit2;
        edit2=null;
        return edit;
    }

    //Author create and edit
    public Chelovek createAuthor(String name, String surename, String email, String pass, Departament dep4Author){
        Chelovek create = new Chelovek(name, surename, email, pass, "Author", dep4Author);
        return create;
    }
    public Chelovek editAuthor(Chelovek edit, String name, String surename, String email, String pass, Departament dep4Author){
        if(name.equals("")){
            name = edit.getName();
        }
        if(surename.equals("")){
            surename = edit.getSurename();
        }
        if(email.equals("")){
            email = edit.getEmail();
        }
        if(pass.equals("")){
            pass = edit.getPass();
        }
        Chelovek edit2 = new Chelovek(name, surename, email, pass, "Author", dep4Author);
        edit = edit2;
        edit2=null;
        return edit;
    }
}
