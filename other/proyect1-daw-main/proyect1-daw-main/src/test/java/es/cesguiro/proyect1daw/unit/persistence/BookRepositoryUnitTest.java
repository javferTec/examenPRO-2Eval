package es.cesguiro.proyect1daw.unit.persistence;

import es.cesguiro.proyect1daw.domain.entity.Book;
import es.cesguiro.proyect1daw.domain.repository.BookRepository;
import es.cesguiro.proyect1daw.persistence.dao.BookDao;
import es.cesguiro.proyect1daw.persistence.repositoryImpl.BookRepositoryImpl;
import es.cesguiro.proyect1daw.mock.BookDaoMockImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BookRepositoryUnitTest {

    private BookDao bookDaoMock = new BookDaoMockImpl();
    private BookRepository bookRepository = new BookRepositoryImpl(bookDaoMock);

    @Test
    public void testFindAll() {
        Book expectedSecondBook = new Book(
                "9788499086460",
                "Mort",
                "Mort es una novela de fantasía escrita por Terry Pratchett",
                new BigDecimal(10.40),
                null);
        List<Book> books = bookRepository.findAll();
        assertEquals(expectedSecondBook, books.get(1));

    }
}
