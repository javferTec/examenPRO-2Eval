package com.fpmislata.examen.business.service;

import com.fpmislata.examen.business.entity.Movie;

import java.util.List;
import java.util.UUID;

public interface MovieService {
    List<Movie> findAll();

    Movie findById(UUID id);

    void delete(UUID id);

    void create(Movie movie);
}
