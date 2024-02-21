package com.fpmislata.examen.domain.service;

import com.fpmislata.examen.domain.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book findById(int id);
}
