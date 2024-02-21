package es.cesguiro.proyect1daw.domain.service.impl;

import es.cesguiro.proyect1daw.domain.entity.Book;
import es.cesguiro.proyect1daw.domain.repository.BookRepository;
import es.cesguiro.proyect1daw.domain.service.BookService;

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
}
