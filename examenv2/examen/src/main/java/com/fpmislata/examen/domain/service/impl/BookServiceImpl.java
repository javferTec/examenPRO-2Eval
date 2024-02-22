package com.fpmislata.examen.domain.service.impl;

import com.fpmislata.examen.domain.entity.Book;
import com.fpmislata.examen.domain.service.BookService;
import com.fpmislata.examen.persistence.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookRepository.findById(id);
    }
}
