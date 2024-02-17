package com.fpmislata.examen.controller;

import com.fpmislata.examen.business.entity.Movie;
import com.fpmislata.examen.business.service.MovieService;
import com.fpmislata.examen.business.service.impl.MovieServiceImpl;
import com.fpmislata.examen.common.MovieIoCContainer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/movies")
public class MovieController {
    private final MovieService moviesService;
    public MovieController() {
        this.moviesService = MovieIoCContainer.getMovieService();
    }

    // MOSTRAR TOD0
    @GetMapping("")
    public String findAll(Model model) {
        List<Movie> movies = moviesService.findAll();
        model.addAttribute("movies", movies);
        return "listAll";
    }

    // MOSTRAR POR ID
    @GetMapping("/{id}")
    public String findById(@PathVariable("id") UUID id, Model model) {
        Movie movie = moviesService.findById(id);
        model.addAttribute("movie", movie);
        return "listById";
    }

    /*
    // CREAR
    @GetMapping("/add")
    public String update() {
        return "create";
    }

    // EDITAR
    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id) {
        return "editById";
    }*/

    // ELIMINAR
    @PostMapping(value = "/{id}", params = "_method=delete")
    public String delete(@PathVariable("id") UUID id) {
        moviesService.delete(id);
        return "redirect:/movies";
    }

}
