package com.example.Kursovaya.person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface ChelovekRepository extends JpaRepository<Chelovek, Long> {
}
