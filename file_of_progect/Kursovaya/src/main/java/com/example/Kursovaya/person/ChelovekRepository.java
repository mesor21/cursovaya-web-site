package com.example.Kursovaya.person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChelovekRepository extends JpaRepository<Chelovek, Long> {
    Chelovek findByEmail(String email);
}
