package es.cesguiro.proyect1daw.persistence.dao;

import es.cesguiro.proyect1daw.domain.entity.Book;

import java.util.List;

public interface BookDao {
    List<Book> findAll();
}
