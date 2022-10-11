package com.example.Kursovaya.logic.Repository;

import com.example.Kursovaya.logic.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRep extends JpaRepository<Post, Long>{
}
