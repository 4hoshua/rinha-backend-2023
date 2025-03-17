package com.rinhapackage.rinha_backend_2023.entities;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Pessoas")

public class People {

    @Id
    @Column(unique = true, nullable = false)
    private UUID id;

    @Column(name = "nome", nullable = false, length = 100)
    private String name;

    @Column(name = "nascimento", nullable = false)
    private Date birthDate;

    @Column(name = "apelido", nullable = false)
    private String nick;

    @ElementCollection
    private List<String> stack = new ArrayList<>();

    public People() {}

    public People(UUID id, String name, Date birthDate, String nick, List<String> stack) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.nick = nick;
        this.stack = stack;
    }

    public List<String> getStack() {return stack;}

    public void setStack(List<String> stack) {this.stack = stack;}

    public UUID getId() {return id;}

    public void setId(UUID id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Date getBirthDate() {return birthDate;}

    public void setBirthDate(Date birthDate) {this.birthDate = birthDate;}

    public String getNick() {return nick;}

    public void setNick(String nick) {this.nick = nick;}
}
