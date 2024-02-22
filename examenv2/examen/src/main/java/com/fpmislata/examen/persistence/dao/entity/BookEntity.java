package com.fpmislata.examen.persistence.dao.entity;

import com.fpmislata.examen.domain.entity.Author;
import com.fpmislata.examen.domain.entity.Book;

public class BookEntity {
    private int id;
    private String title;
    private int authorId;

    public BookEntity(int id, String title, int authorId) {
        this.id = id;
        this.title = title;
        this.authorId = authorId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getAuthorId() {
        return authorId;
    }
}

