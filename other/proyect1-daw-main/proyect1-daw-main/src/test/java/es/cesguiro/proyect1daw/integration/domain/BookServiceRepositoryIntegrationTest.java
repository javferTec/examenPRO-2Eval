package es.cesguiro.proyect1daw.integration.domain;

import es.cesguiro.proyect1daw.domain.entity.Book;
import es.cesguiro.proyect1daw.domain.repository.BookRepository;
import es.cesguiro.proyect1daw.domain.service.BookService;
import es.cesguiro.proyect1daw.domain.service.impl.BookServiceImpl;
import es.cesguiro.proyect1daw.mock.BookDaoMockImpl;
import es.cesguiro.proyect1daw.persistence.dao.BookDao;
import es.cesguiro.proyect1daw.persistence.repositoryImpl.BookRepositoryImpl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookServiceRepositoryIntegrationTest {

    private final BookDao bookDaoMock = new BookDaoMockImpl();
    private final BookRepository bookRepository = new BookRepositoryImpl(bookDaoMock);
    private final BookService bookService = new BookServiceImpl(bookRepository);

    @Test
    public void testFindAll() {
        Book expectedSecondBook = new Book(
                "9788499086460",
                "Mort",
                "Mort es una novela de fantasía escrita por Terry Pratchett",
                new BigDecimal(10.40),
                null);
        List<Book> books = bookService.findAll();
        assertEquals(expectedSecondBook, books.get(1));

    }
}
