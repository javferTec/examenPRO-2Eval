package com.fpmislata.examen.business.service.impl;

import com.fpmislata.examen.business.entity.Director;
import com.fpmislata.examen.business.service.DirectorService;
import com.fpmislata.examen.persistance.DirectorRepository;
import com.fpmislata.examen.persistance.MovieRepository;

import java.util.List;

public class DirectorServiceImpl implements DirectorService {
    private final DirectorRepository directorRepository;
    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }


    @Override
    public List<Director> findAll() {
        return directorRepository.findAll();
    }
}
