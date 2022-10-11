package com.example.Kursovaya.person.Repository;

import com.example.Kursovaya.person.Chelovek;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChelovekRep extends JpaRepository<Chelovek, Long> {
}
