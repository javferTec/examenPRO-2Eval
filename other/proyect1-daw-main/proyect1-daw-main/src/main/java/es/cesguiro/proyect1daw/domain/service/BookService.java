package es.cesguiro.proyect1daw.domain.service;

import es.cesguiro.proyect1daw.domain.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
}
