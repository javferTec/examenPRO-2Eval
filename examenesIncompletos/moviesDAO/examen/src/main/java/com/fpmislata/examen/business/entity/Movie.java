package com.fpmislata.examen.business.entity;

import java.util.List;
import java.util.UUID;

public class Movie {
    private UUID id;
    private String title;
    private int year;
    private String image;
    private int runtime;
    private String description;
    private Director director;
    private List<Actor> actors;

    public Movie(String title, int year, String image, int runtime, String description, Director director, List<Actor> actors) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.year = year;
        this.image = image;
        this.runtime = runtime;
        this.description = description;
        this.director = director;
        this.actors = actors;
    }

    public Movie() {}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", image='" + image + '\'' +
                ", runtime=" + runtime +
                ", description='" + description + '\'' +
                ", director=" + director +
                ", actors=" + actors +
                '}';
    }
}
