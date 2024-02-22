package com.fpmislata.examen.persistence.dao.impl;

import com.fpmislata.examen.persistence.dao.AuthorDao;
import com.fpmislata.examen.persistence.dao.entity.AuthorEntity;

import java.util.ArrayList;
import java.util.List;

public class AuthorDaoImpl implements AuthorDao {
    private List<AuthorEntity> authores = new ArrayList<>(List.of(
            new AuthorEntity(2, "Gabriel García Márquez"),
            new AuthorEntity(1, "Antoine de Saint-Exupéry")
    ));

    @Override
    public AuthorEntity findById(int authorId) {
        for (AuthorEntity author : authores) {
             if (author.getId() == authorId) {
                 return author;
             }
        }
        return null;
    }
}
