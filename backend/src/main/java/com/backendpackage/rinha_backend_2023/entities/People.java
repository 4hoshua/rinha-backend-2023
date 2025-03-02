package com.backendpackage.rinha_backend_2023.entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "Pessoas")
public class People {

    @Id
    @Column(unique = true, nullable = false)
    private UUID id;

    @Column(name = "nome", length = 100, nullable = false)
    private String name;

    @Column(name = "apelido", length = 32, unique = true, nullable = false)
    private String nick;

    @OneToMany
    @JoinTable(name = "pessoas_stack",
    joinColumns = @JoinColumn(name = "people_uuid"),
    inverseJoinColumns = @JoinColumn(name = "stack_id"))
    private Set<Stack> stacks = new HashSet<>();

    public People () {};

    public People(UUID id, String name, String nick) {
        this.id = id;
        this.name = name;
        this.nick = nick;
    }

    public Set<Stack> getStacks() {return stacks;}

    public void setStacks(Set<Stack> stacks) {this.stacks = stacks;}

    public UUID getId() {return id;}

    public void setId(UUID  id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getNick() {return nick;}

    public void setNick(String nick) {this.nick = nick;}
}
