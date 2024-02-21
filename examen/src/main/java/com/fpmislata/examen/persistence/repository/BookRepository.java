package com.fpmislata.examen.persistence.repository;

import com.fpmislata.examen.domain.entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAll();

    Book findById(int id);
}
