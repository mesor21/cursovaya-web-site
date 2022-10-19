package com.example.Kursovaya.logic.Repository;

import com.example.Kursovaya.logic.Themes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface ThemesRep extends JpaRepository<Themes,Long> {
}
