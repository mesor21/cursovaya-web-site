package com.example.Kursovaya.logic;

public class Departamtnt implements IDepartmentName {
    private String dep;

    public Departamtnt(String dep) {
        this.dep = dep;
    }

    @Override
    public String getDep(){
        return dep;
    };
}
