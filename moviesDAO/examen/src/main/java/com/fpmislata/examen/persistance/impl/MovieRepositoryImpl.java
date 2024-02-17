package com.fpmislata.examen.persistance.impl;

import com.fpmislata.examen.business.entity.Movie;
import com.fpmislata.examen.persistance.MovieRepository;
import com.fpmislata.examen.persistance.dao.MoviesDao;

import java.util.List;
import java.util.UUID;

public class MovieRepositoryImpl implements MovieRepository {
    private MoviesDao moviesDao = new MoviesDao();
    private List<Movie> movies = moviesDao.getAll();

    @Override
    public List<Movie> findAll() {
        return movies;
    }

    @Override
    public Movie findById(UUID id) {
        for (Movie movie : movies) {
            if (movie.getId().equals(id)) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public void delete(UUID id) {
        movies.removeIf(movie -> movie.getId().equals(id));
    }
}
