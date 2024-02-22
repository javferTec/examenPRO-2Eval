package com.fpmislata.examen.common;

import com.fpmislata.examen.business.service.ActorService;
import com.fpmislata.examen.business.service.DirectorService;
import com.fpmislata.examen.business.service.MovieService;
import com.fpmislata.examen.business.service.impl.ActorServiceImpl;
import com.fpmislata.examen.business.service.impl.DirectorServiceImpl;
import com.fpmislata.examen.business.service.impl.MovieServiceImpl;
import com.fpmislata.examen.persistance.ActorRepository;
import com.fpmislata.examen.persistance.DirectorRepository;
import com.fpmislata.examen.persistance.MovieRepository;
import com.fpmislata.examen.persistance.impl.ActorRepositoryImpl;
import com.fpmislata.examen.persistance.impl.DirectorRepositoryImpl;
import com.fpmislata.examen.persistance.impl.MovieRepositoryImpl;

public class MovieIoCContainer {
    private static MovieService movieService;
    private static MovieRepository movieRepository;
    private static DirectorService directorService;
    private static DirectorRepository directorRepository;
    private static ActorService actorService;
    private static ActorRepository actorRepository;

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

    public static DirectorService getDirectorService() {
        if (directorService == null) {
            directorService = new DirectorServiceImpl(getDirectorRepository());
        }
        return directorService;
    }

    private static DirectorRepository getDirectorRepository() {
        if (directorRepository == null) {
            directorRepository = new DirectorRepositoryImpl();
        }
        return directorRepository;
    }

    public static ActorService getActorService() {
        if (actorService == null) {
            actorService = new ActorServiceImpl(getActorRepository());
        }
        return actorService;
    }

    private static ActorRepository getActorRepository() {
        if (actorRepository == null) {
            actorRepository = new ActorRepositoryImpl();
        }
        return actorRepository;
    }

}
