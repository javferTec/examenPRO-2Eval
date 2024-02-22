package com.fpmislata.examen.persistance.dao;

import com.fpmislata.examen.business.entity.Actor;
import com.fpmislata.examen.business.entity.Director;
import com.fpmislata.examen.business.entity.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MoviesDao {
    private ActorsDao actorsDao = new ActorsDao();
    private DirectorsDao directorsDao = new DirectorsDao();
    private List<Movie> movies = new ArrayList<>(List.of(
            new Movie("Pelicula 1", 1000, "pelicula1.jpg", 1, "esta es la pelicula 1", findDirectorById(1), List.of(findActorById(1), findActorById(2))),
            new Movie("Pelicula 2", 2000, "pelicula2.jpg", 2, "esta es la pelicula 2", findDirectorById(2), List.of(findActorById(3), findActorById(4))),
            new Movie("Pelicula 3", 3000, "pelicula3.jpg", 3, "esta es la pelicula 3", findDirectorById(3), List.of(findActorById(5), findActorById(6))),
            new Movie("Pelicula 4", 4000, "pelicula4.jpg", 4, "esta es la pelicula 4", findDirectorById(4), List.of(findActorById(3), findActorById(1))),
            new Movie("Pelicula 5", 5000, "pelicula5.jpg", 5, "esta es la pelicula 5", findDirectorById(5), findActorsDaoAll()),
            new Movie("Pelicula 6", 6000, "pelicula6.jpg", 6, "esta es la pelicula 6", findDirectorById(6), findActorsDaoAll())
    ));

    private List<Actor> findActorsDaoAll() {
        return actorsDao.findAll();
    }

    private Actor findActorById(int id) {
        return actorsDao.findById(id);
    }

    private Director findDirectorById(int id) {
        return directorsDao.findById(id);
    }

    public List<Movie> findAll() {
        return movies;
    }
}