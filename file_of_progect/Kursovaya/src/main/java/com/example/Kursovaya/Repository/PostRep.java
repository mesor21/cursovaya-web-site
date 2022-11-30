package com.example.Kursovaya.Repository;

import com.example.Kursovaya.logic.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRep extends JpaRepository<Post, Long>{
    List<Post> findByAuthorID(Long autorId);
}
