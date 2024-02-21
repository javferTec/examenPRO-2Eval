package com.fpmislata.examen.persistence.repository.impl;

import com.fpmislata.examen.common.container.AuthorIoC;
import com.fpmislata.examen.domain.entity.Book;
import com.fpmislata.examen.persistence.dao.AuthorDao;
import com.fpmislata.examen.persistence.dao.BookDao;
import com.fpmislata.examen.persistence.repository.BookRepository;
import com.fpmislata.examen.persistence.repository.mapper.BookMapper;

import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    private final BookDao bookDao;

    public BookRepositoryImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List<Book> findAll() {
        return BookMapper.toBookList(bookDao.findAll());
    }

    @Override
    public Book findById(int id) {
        return BookMapper.toBook(bookDao.findById(id));
    }
}
