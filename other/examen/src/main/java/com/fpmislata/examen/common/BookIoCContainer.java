package com.fpmislata.examen.common;

import com.fpmislata.examen.business.service.BooksService;
import com.fpmislata.examen.business.service.impl.BooksServiceImpl;
import com.fpmislata.examen.persistance.BookRepository;
import com.fpmislata.examen.persistance.impl.StaticBookRepositoryImpl;

public class BookIoCContainer {
    private static BooksService service;
    private static BookRepository repository;

    public static BooksService getBookService() {
        if(service == null) {
            service = new BooksServiceImpl(getBookRepository());
        }
        return service;
    }

    public static BookRepository getBookRepository() {
        if(repository == null) {
            repository = new StaticBookRepositoryImpl();
        }
        return repository;
    }
}
