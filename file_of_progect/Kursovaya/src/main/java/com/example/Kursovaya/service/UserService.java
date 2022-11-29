package com.example.Kursovaya.service;

import com.example.Kursovaya.Repository.ChelovekRepository;
import com.example.Kursovaya.logic.Chelovek;
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

    public void DeleteAllUsers(Boolean uShure){
        if(uShure){
            int len= userRepo.findAll().size();
            for(int i = 0; i<len; i++){
                userRepo.deleteById(userRepo.findAll().get(i).getId());
            }
        }
    }
    public void ListAllUsers(){
        int len= userRepo.findAll().size();
        for(int i = 0; i<len; i++){
            System.out.println(userRepo.findAll().get(i).getName()+" "+userRepo.findAll().get(i).getSurename()+" "+userRepo.findAll().get(i).getPass());
        }
    }

    public boolean saveUser(Chelovek user){//согласен, роль так делать очень грамостко, но всё же
        Chelovek userFromeBD = userRepo.findByEmail(user.getEmail());

        if(userFromeBD!=null) {
            return false;
        }
        userRepo.save(user);
        return true;
    }
}
