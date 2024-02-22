package com.fpmislata.examen.common.container;

import com.fpmislata.examen.domain.service.BookService;
import com.fpmislata.examen.domain.service.impl.BookServiceImpl;
import com.fpmislata.examen.persistence.dao.BookDao;
import com.fpmislata.examen.persistence.dao.impl.BookDaoImpl;
import com.fpmislata.examen.persistence.repository.BookRepository;
import com.fpmislata.examen.persistence.repository.impl.BookRepositoryImpl;

public class BookIoC {
    private static BookService bookService;
    private static BookRepository bookRepository;
    private static BookDao bookDao;

    public static BookService getBookService() {
        if(bookService == null) {
            bookService = new BookServiceImpl(getBookRepository());
        }
        return bookService;
    }

    public static BookRepository getBookRepository() {
        if(bookRepository == null) {
            bookRepository = new BookRepositoryImpl(getBookDao());
        }
        return bookRepository;
    }

    public static BookDao getBookDao() {
        if(bookDao == null) {
            bookDao = new BookDaoImpl();
        }
        return bookDao;
    }
}
