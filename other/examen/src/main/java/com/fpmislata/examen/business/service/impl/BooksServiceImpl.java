package com.fpmislata.examen.business.service.impl;

import com.fpmislata.examen.business.entity.Book;
import com.fpmislata.examen.business.service.BooksService;
import com.fpmislata.examen.persistance.BookRepository;
import com.fpmislata.examen.persistance.impl.StaticBookRepositoryImpl;
import java.util.List;

public class BooksServiceImpl implements BooksService {
    private final BookRepository repository;
    public BooksServiceImpl(BookRepository bookRepository) {
        this.repository = bookRepository;
    }

    @Override
    public List<Book> getAll() {
        return this.repository.all();
    }
    @Override
    public Book getById(int id) {
        return this.repository.getById(id);
    }
    @Override
    public int getMaxId() {
        return this.repository.getMaxId();
    }

    @Override
    public void insert(Book newBook) {
        repository.insert(newBook);
    }
}
