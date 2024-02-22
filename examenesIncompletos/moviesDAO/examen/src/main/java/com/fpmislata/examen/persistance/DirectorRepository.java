package com.fpmislata.examen.persistance;

import com.fpmislata.examen.business.entity.Director;

import java.util.List;

public interface DirectorRepository {
    List<Director> findAll();

    Director findById(Integer directorId);
}
