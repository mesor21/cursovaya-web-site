package com.example.Kursovaya.service;

import com.example.Kursovaya.Repository.ChelovekRepository;
import com.example.Kursovaya.logic.Chelovek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserDetailServiceConfig implements UserDetailsService {
    @Autowired
    private ChelovekRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        System.out.println(login);
        Chelovek userSystem=userRepository.findByEmail(login);
        if(userSystem==null){
            throw new UsernameNotFoundException("User not authorized.");
        }
        GrantedAuthority authority = new SimpleGrantedAuthority(userSystem.getRoles());
        UserDetails  userDetails = new User(userSystem.getEmail(),userSystem.getPass(), Arrays.asList(authority));

        System.out.println(userDetails.getUsername() +":"+userDetails.getPassword()+". Role"+userDetails.getAuthorities());
        return userDetails;
    }
}
