package com.example.Kursovaya.Repository;
import com.example.Kursovaya.logic.Chelovek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Repository
public interface ChelovekRepository extends JpaRepository<Chelovek, Long>{

    Optional<Chelovek> findByEmail(String email);
    Optional<Chelovek> findById(Long id);
}
