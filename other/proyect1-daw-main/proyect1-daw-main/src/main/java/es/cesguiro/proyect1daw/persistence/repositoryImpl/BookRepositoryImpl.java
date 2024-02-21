package es.cesguiro.proyect1daw.persistence.repositoryImpl;

import es.cesguiro.proyect1daw.domain.entity.Book;
import es.cesguiro.proyect1daw.domain.repository.BookRepository;
import es.cesguiro.proyect1daw.persistence.dao.BookDao;

import java.util.List;

public class BookRepositoryImpl implements BookRepository {

    private final BookDao bookDao;

    public BookRepositoryImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }
}
