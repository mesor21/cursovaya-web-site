package com.example.Kursovaya.Repository;

import com.example.Kursovaya.logic.Themes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemesRep extends JpaRepository<Themes,Long> {
}
