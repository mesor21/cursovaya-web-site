package com.example.Kursovaya.logic.Repository;

import com.example.Kursovaya.logic.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface PostRep extends JpaRepository<Post, Long>{
}
