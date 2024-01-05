package com.example.springjpaonazure.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime birthdate;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDateTime birthdate) {
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
