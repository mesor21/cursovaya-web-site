package com.example.Kursovaya.service;

import com.example.Kursovaya.logic.Chelovek;
import com.example.Kursovaya.logic.Repository.ChelovekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private ChelovekRepository userRepo;

    public void add(Chelovek user){
        userRepo.save(user);
    }
    public void delete(Long id){
        userRepo.deleteById(id);
    }
}
