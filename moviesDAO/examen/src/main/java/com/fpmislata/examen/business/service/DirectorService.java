package com.fpmislata.examen.business.service;

import com.fpmislata.examen.business.entity.Director;

import java.util.List;

public interface DirectorService {
    List<Director> findAll();

    Director findById(Integer directorId);
}
