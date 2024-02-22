package com.fpmislata.examen.persistence.repository.mapper;

import com.fpmislata.examen.domain.entity.Author;
import com.fpmislata.examen.domain.entity.Book;
import com.fpmislata.examen.persistence.dao.entity.AuthorEntity;
import com.fpmislata.examen.persistence.dao.entity.BookEntity;

import java.util.ArrayList;
import java.util.List;

public class AuthorMapper {
    public static Author toAuthor(AuthorEntity authorEntity) {
        return new Author(
                authorEntity.getId(),
                authorEntity.getName()
        );
    }

    public static List<Author> toAuthorList(List<AuthorEntity> authorEntityList) {
        List<Author> authorList = new ArrayList<>();
        for (AuthorEntity authorEntity : authorEntityList) {
            authorList.add(toAuthor(authorEntity));
        }
        return authorList;
    }
}
