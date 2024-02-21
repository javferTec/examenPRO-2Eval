package es.cesguiro.proyect1daw.domain.repository;

import es.cesguiro.proyect1daw.domain.entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAll();
}
