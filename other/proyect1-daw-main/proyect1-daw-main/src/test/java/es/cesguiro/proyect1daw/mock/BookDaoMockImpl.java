package es.cesguiro.proyect1daw.mock;

import es.cesguiro.proyect1daw.domain.entity.Book;
import es.cesguiro.proyect1daw.persistence.dao.BookDao;

import java.math.BigDecimal;
import java.util.List;

public class BookDaoMockImpl implements BookDao {

    List<Book> bookList = List.of(
            new Book(
                    "9788433920423",
                    "La conjura de los necios",
                    "El protagonista de esta novela es uno de los personajes más memorables de la literatura norteamericana",
                    new BigDecimal(13.20),
                    null),
            new Book(
                    "9788499086460",
                    "Mort",
                    "Mort es una novela de fantasía escrita por Terry Pratchett",
                    new BigDecimal(10.40),
                    null),
            new Book(
                    "9788496173729",
                    "La espada del destino",
                    "La vida de un brujo cazador de monstruos no es fácil",
                    new BigDecimal(22.75),
                    null)
    );

    @Override
    public List<Book> findAll() {
        return bookList;
    }
}
