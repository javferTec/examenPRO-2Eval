package es.cesguiro.proyect1daw.persistence.dao.mapper;

import es.cesguiro.proyect1daw.domain.entity.Book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookMapper {

    public Book toBook(ResultSet resultSet) {
        if(resultSet ==  null) {
            return null;
        }
        Book book = new Book();

        try {
            book.setIsbn(resultSet.getString("isbn"));
            book.setTitle(resultSet.getString("title"));
            book.setSynopsis(resultSet.getString("synopsis"));
            book.setPrice(resultSet.getBigDecimal("price"));
            book.setCover(resultSet.getString("cover"));
        } catch (SQLException e) {
            throw new RuntimeException("Algo no ha funcionado: " + e.getMessage());
        }
        return book;
    }

    public List<Book> toBookList(ResultSet resultSet) {
        if(resultSet ==  null) {
            return null;
        }
        List<Book> bookList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                bookList.add(toBook(resultSet));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Algo no ha funcionado: " + e.getMessage());
        }
        return bookList;
    }
}
