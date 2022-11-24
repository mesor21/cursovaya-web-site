package com.example.Kursovaya.logic;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {
    private @Id @GeneratedValue Long id;
    private String name;
    @OneToMany(mappedBy = "roles")
    private Set<Chelovek> cheloveks;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCheloveks(Set<Chelovek> cheloveks) {
        this.cheloveks = cheloveks;
    }

    public String getName() {
        return name;
    }

    public Set<Chelovek> getCheloveks() {
        return cheloveks;
    }

    public Long getId() {
        return id;
    }
}
