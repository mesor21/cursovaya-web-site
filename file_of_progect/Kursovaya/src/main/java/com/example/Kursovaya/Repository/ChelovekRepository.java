package com.example.Kursovaya.Repository;
import com.example.Kursovaya.logic.Chelovek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChelovekRepository extends JpaRepository<Chelovek, Long>{

    Chelovek findByEmail(String email);
    List<Chelovek> findByPass(String pass);
}
