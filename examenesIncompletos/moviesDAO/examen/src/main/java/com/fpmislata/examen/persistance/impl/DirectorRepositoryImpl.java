package com.fpmislata.examen.persistance.impl;

import com.fpmislata.examen.business.entity.Director;
import com.fpmislata.examen.persistance.DirectorRepository;
import com.fpmislata.examen.persistance.dao.DirectorsDao;

import java.util.List;

public class DirectorRepositoryImpl implements DirectorRepository {
    private DirectorsDao directorDao = new DirectorsDao();
    @Override
    public List<Director> findAll() {
        return directorDao.findAll();
    }

    @Override
    public Director findById(Integer directorId) {
        return directorDao.findById(directorId);
    }
}
