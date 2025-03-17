package com.rinhapackage.rinha_backend_2023.dto;

import com.rinhapackage.rinha_backend_2023.entities.People;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class PeopleDTO {

    private UUID id;
    private String name;
    private Date birthDate;
    private String nick;
    private List<String> Stack = new ArrayList<>();

    public PeopleDTO() {}

    public PeopleDTO(UUID id, String name, Date birthDate, String nick, List<String> stack) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.nick = nick;
    }

    public PeopleDTO(People entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.birthDate = entity.getBirthDate();
        this.nick = entity.getNick();
    }

    public PeopleDTO(People entity, List<String> stack) {
        this(entity);
        Stack.addAll(stack);
    }

    public UUID getId() {return id;}

    public void setId(UUID id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Date getBirthDate() {return birthDate;}

    public void setBirthDate(Date birthDate) {this.birthDate = birthDate;}

    public String getNick() {return nick;}

    public void setNick(String nick) {this.nick = nick;}

    public List<String> getStack() {return Stack;}

    public void setStack(List<String> stack) {Stack = stack;}
}
