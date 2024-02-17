package com.fpmislata.examen.common;

import com.fpmislata.examen.business.service.MovieService;
import com.fpmislata.examen.business.service.impl.MovieServiceImpl;
import com.fpmislata.examen.persistance.MovieRepository;
import com.fpmislata.examen.persistance.impl.MovieRepositoryImpl;

public class MovieIoCContainer {
    private static MovieService movieService;
    private static MovieRepository movieRepository;

    public static MovieService getMovieService() {
        if (movieService == null) {
            movieService = new MovieServiceImpl(getMovieRepository());
        }
        return movieService;
    }

    private static MovieRepository getMovieRepository() {
        if (movieRepository == null) {
            movieRepository = new MovieRepositoryImpl();
        }
        return movieRepository;
    }

}
