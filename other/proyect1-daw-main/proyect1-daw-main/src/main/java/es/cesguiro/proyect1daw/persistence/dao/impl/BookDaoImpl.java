package es.cesguiro.proyect1daw.persistence.dao.impl;

import es.cesguiro.proyect1daw.domain.entity.Book;
import es.cesguiro.proyect1daw.persistence.dao.BookDao;
import es.cesguiro.proyect1daw.persistence.dao.db.DBConnection;
import es.cesguiro.proyect1daw.persistence.dao.mapper.BookMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class BookDaoImpl implements BookDao {

    private final DBConnection dbConnection;
    private final BookMapper bookMapper;

    public BookDaoImpl() {
        this.bookMapper = new BookMapper();
        this.dbConnection = new DBConnection();
    }

    @Override
    public List<Book> findAll() {
        String sql = "SELECT * FROM books";
        try {
            PreparedStatement preparedStatement = dbConnection.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = preparedStatement.executeQuery();
            return bookMapper.toBookList(resultSet);
        } catch (Exception e) {
            throw new RuntimeException("Error al ejecutar la sentencia: " + sql);
        }
    }
}
