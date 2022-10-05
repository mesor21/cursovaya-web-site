package com.example.Kursovaya.logic;

public class Departament implements IDepartmentName {
    private String dep;

    public Departament(String dep) {
        this.dep = dep;
    }

    @Override
    public String getDep(){
        return dep;
    };
}
