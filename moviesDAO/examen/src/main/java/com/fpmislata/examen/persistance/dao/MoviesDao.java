package com.fpmislata.examen.persistance.dao;

import com.fpmislata.examen.business.entity.Actor;
import com.fpmislata.examen.business.entity.Director;
import com.fpmislata.examen.business.entity.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MoviesDao {
    private ActorsDao actorsDao = new ActorsDao();
    private List<Movie> movies = new ArrayList<>(List.of(
            new Movie(UUID.randomUUID(), "Pelicula 1", 1000, "pelicula1.jpg", 1, "esta es la pelicula 1", new Director(1, "Director 1", 1000, 9000), getActorsDaoAll()),
            new Movie(UUID.randomUUID(), "Pelicula 2", 2000, "pelicula2.jpg", 2, "esta es la pelicula 2", new Director(1, "Director 2", 1000, 9000), getActorsDaoAll()),
            new Movie(UUID.randomUUID(), "Pelicula 3", 3000, "pelicula3.jpg", 3, "esta es la pelicula 3", new Director(1, "Director 3", 1000, 9000), getActorsDaoAll()),
            new Movie(UUID.randomUUID(), "Pelicula 4", 4000, "pelicula4.jpg", 4, "esta es la pelicula 4", new Director(1, "Director 4", 1000, 9000), getActorsDaoAll()),
            new Movie(UUID.randomUUID(), "Pelicula 5", 5000, "pelicula5.jpg", 5, "esta es la pelicula 5", new Director(1, "Director 5", 1000, 9000), getActorsDaoAll()),
            new Movie(UUID.randomUUID(), "Pelicula 6", 6000, "pelicula6.jpg", 6, "esta es la pelicula 6", new Director(1, "Director 6", 1000, 9000), getActorsDaoAll())
    ));

    private List<Actor> getActorsDaoAll() {
        return actorsDao.getAll();
    }

    public List<Movie> getAll() {
        return movies;
    }
}