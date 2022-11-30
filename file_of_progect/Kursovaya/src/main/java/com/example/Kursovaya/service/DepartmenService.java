package com.example.Kursovaya.service;

import com.example.Kursovaya.Repository.DepartmentRep;
import com.example.Kursovaya.logic.Departament;
import com.example.Kursovaya.logic.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmenService {

    @Autowired
    DepartmentRep departmentRep;

    public List<Departament> getAllDepartament(){
        return  departmentRep.findAll();
    }

    public void addNewDep(){
        departmentRep.save(new Departament());
    }
}
