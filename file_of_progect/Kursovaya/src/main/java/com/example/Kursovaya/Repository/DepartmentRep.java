package com.example.Kursovaya.Repository;

import com.example.Kursovaya.logic.Departament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRep extends JpaRepository<Departament,Long> {
}
