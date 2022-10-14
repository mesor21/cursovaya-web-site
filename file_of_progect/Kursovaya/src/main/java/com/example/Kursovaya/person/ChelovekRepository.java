package com.example.Kursovaya.person;

import com.example.Kursovaya.person.Chelovek;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChelovekRepository extends JpaRepository<Chelovek, Long> {
    Chelovek findByEmail(String email);
    Chelovek findById(long id);

}
