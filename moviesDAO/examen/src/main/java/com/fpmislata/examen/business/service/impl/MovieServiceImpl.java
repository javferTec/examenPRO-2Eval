package com.fpmislata.examen.business.service.impl;

import com.fpmislata.examen.business.entity.Movie;
import com.fpmislata.examen.business.service.MovieService;
import com.fpmislata.examen.persistance.MovieRepository;
import com.fpmislata.examen.persistance.impl.MovieRepositoryImpl;

import java.util.List;
import java.util.UUID;

public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findById(UUID id) {
        return movieRepository.findById(id);
    }

    @Override
    public void delete(UUID id) {
        movieRepository.delete(id);
    }

    @Override
    public void create(Movie movie) {
        movieRepository.create(movie);
    }
}
