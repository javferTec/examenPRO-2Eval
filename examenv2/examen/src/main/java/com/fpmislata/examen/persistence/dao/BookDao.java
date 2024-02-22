package com.fpmislata.examen.persistence.dao;

import com.fpmislata.examen.domain.entity.Book;
import com.fpmislata.examen.persistence.dao.entity.BookEntity;

import java.util.List;

public interface BookDao {
    List<BookEntity> findAll();

    BookEntity findById(int id);
}
