package com.example.Kursovaya.logic.Repository;
import com.example.Kursovaya.logic.Chelovek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Repository
public interface ChelovekRepository extends JpaRepository<Chelovek, Long>{
<<<<<<< HEAD
    List<Chelovek> findByemail(@Param("email") String email);
=======
    Optional<Chelovek> findByEmail(@Param("email") String email);
>>>>>>> 269dfb0b6508e03315d5f1b1ed9389b6c0cbd9ca
    Optional<Chelovek> findById(@Param("id")Long id);
}
