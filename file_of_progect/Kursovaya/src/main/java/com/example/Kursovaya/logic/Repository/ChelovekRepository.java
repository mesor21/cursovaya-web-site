package com.example.Kursovaya.logic.Repository;
import com.example.Kursovaya.logic.Chelovek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public interface ChelovekRepository extends JpaRepository<Chelovek, Long>{
    List<Chelovek> findByemail(@Param("email") String email);
}
