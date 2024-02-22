package com.fpmislata.examen.domain.entity;

public class Book {
    private int id;
    private String title;
    private Author author;

    public Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}
