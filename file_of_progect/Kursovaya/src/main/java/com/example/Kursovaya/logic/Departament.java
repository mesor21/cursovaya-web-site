package com.example.Kursovaya.logic;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Departament{
    private String dep;
    private @Id @GeneratedValue Long id;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "departament")
    private Set<Chelovek> user;

    public Set<Chelovek> getUser() {
        return user;
    }
    public void setUser(Set<Chelovek> user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public Departament(){}
    public Departament(String dep) {
        this.dep = dep;
    }

    public String getDep(){
        return dep;
    };
}
