package com.example.Kursovaya.Repository;

import com.example.Kursovaya.logic.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRep extends JpaRepository<Post, Long>{
}
