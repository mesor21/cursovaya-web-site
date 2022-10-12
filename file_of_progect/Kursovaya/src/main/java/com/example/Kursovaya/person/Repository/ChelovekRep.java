package com.example.Kursovaya.person.Repository;

import com.example.Kursovaya.person.Chelovek;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChelovekRep extends JpaRepository<Chelovek, Long> {
    Chelovek findByEmail(String email);
    Chelovek findById(long id);
}
