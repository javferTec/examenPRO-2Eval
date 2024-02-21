package com.fpmislata.examen.business.service;

import com.fpmislata.examen.business.entity.Book;
import java.util.List;

public interface BooksService {
    List<Book> getAll();
    Book getById(int id);
    int getMaxId();

    void insert(Book newBook);
}
