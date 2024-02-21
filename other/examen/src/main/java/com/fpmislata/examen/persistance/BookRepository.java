package com.fpmislata.examen.persistance;

import com.fpmislata.examen.business.entity.Book;
import java.util.List;

public interface BookRepository {
    List<Book> all();
    Book getById(int id);
    int getMaxId();

    void insert(Book newBook);
}
