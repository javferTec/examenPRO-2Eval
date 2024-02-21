package com.fpmislata.examen.persistence.dao.impl;

import com.fpmislata.examen.persistence.dao.BookDao;
import com.fpmislata.examen.persistence.dao.entity.BookEntity;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {
    private List<BookEntity> books = new ArrayList<>(List.of(
            new BookEntity(1, "El principito", 1),
            new BookEntity(2, "Cien años de soledad", 2)
    ));

    @Override
    public List<BookEntity> findAll() {
        return books;
    }

    @Override
    public BookEntity findById(int id) {
        for (BookEntity book: books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}
