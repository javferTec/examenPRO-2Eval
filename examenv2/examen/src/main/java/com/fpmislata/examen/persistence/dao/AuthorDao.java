package com.fpmislata.examen.persistence.dao;

import com.fpmislata.examen.persistence.dao.entity.AuthorEntity;

public interface AuthorDao {
    AuthorEntity findById(int authorId);
}
