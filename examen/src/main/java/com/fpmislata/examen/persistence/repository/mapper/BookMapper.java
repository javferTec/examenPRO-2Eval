package com.fpmislata.examen.persistence.repository.mapper;

import com.fpmislata.examen.common.container.AuthorIoC;
import com.fpmislata.examen.domain.entity.Author;
import com.fpmislata.examen.domain.entity.Book;
import com.fpmislata.examen.persistence.dao.AuthorDao;
import com.fpmislata.examen.persistence.dao.entity.AuthorEntity;
import com.fpmislata.examen.persistence.dao.entity.BookEntity;

import java.util.ArrayList;
import java.util.List;

public class BookMapper {
    public static Book toBook(BookEntity bookEntity) {
        AuthorDao authorDao = AuthorIoC.getAuthorDao();
        AuthorEntity author = authorDao.findById(bookEntity.getAuthorId());
        return new Book(bookEntity.getId(),
                bookEntity.getTitle(),
                new Author(author.getId(), author.getName())
        );
    }

    public static List<Book> toBookList(List<BookEntity> bookEntityList) {
        List<Book> bookList = new ArrayList<>();
        for (BookEntity bookEntity : bookEntityList) {
            bookList.add(toBook(bookEntity));
        }
        return bookList;
    }
}
