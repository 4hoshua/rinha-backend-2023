package com.backendpackage.rinha_backend_2023.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Stack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "stackname")
    private String stackName;

    @ManyToOne
    private People people;

    public Stack() {}

    public Stack(Long id, String stackName) {
        this.id = id;
        this.stackName = stackName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    public People getPeople() {return people;}

    public void setPeople(People people) {this.people = people;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stack stack = (Stack) o;
        return Objects.equals(id, stack.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
