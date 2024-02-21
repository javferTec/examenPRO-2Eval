package com.fpmislata.examen.common.container;

import com.fpmislata.examen.domain.service.AuthorService;
import com.fpmislata.examen.domain.service.impl.AuthorServiceImpl;
import com.fpmislata.examen.persistence.dao.AuthorDao;
import com.fpmislata.examen.persistence.dao.impl.AuthorDaoImpl;
import com.fpmislata.examen.persistence.repository.AuthorRepository;
import com.fpmislata.examen.persistence.repository.impl.AuthorRepositoryImpl;

public class AuthorIoC {
    private static AuthorService authorService;
    private static AuthorRepository authorRepository;
    private static AuthorDao authorDao;

    public static AuthorService getAuthorService() {
        if(authorService == null) {
            authorService = new AuthorServiceImpl(getAuthorRepository());
        }
        return authorService;
    }

    public static AuthorRepository getAuthorRepository() {
        if(authorRepository == null) {
            authorRepository = new AuthorRepositoryImpl(getAuthorDao());
        }
        return authorRepository;
    }

    public static AuthorDao getAuthorDao() {
        if(authorDao == null) {
            authorDao = new AuthorDaoImpl();
        }
        return authorDao;
    }
}
