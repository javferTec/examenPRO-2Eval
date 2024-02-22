package com.fpmislata.examen.persistence.dao.entity;

public class AuthorEntity {
    private int id;
    private String name;

    public AuthorEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

}
