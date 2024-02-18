package com.fpmislata.examen.controller;

import com.fpmislata.examen.business.entity.Actor;
import com.fpmislata.examen.business.entity.Director;
import com.fpmislata.examen.business.entity.Movie;
import com.fpmislata.examen.business.service.ActorService;
import com.fpmislata.examen.business.service.DirectorService;
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
    private final DirectorService directorService;
    private final ActorService actorService;
    public MovieController() {
        this.moviesService = MovieIoCContainer.getMovieService();
        this.directorService = MovieIoCContainer.getDirectorService();
        this.actorService = MovieIoCContainer.getActorService();
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


    // CREAR
    @GetMapping("/add")
    public String showFormToCreate(Model model) {
        List<Director> directors = directorService.findAll();
        List<Actor> actors = actorService.findAll();
        model.addAttribute("actors", actors);
        model.addAttribute("directors", directors);
        model.addAttribute("movie", new Movie());
        return "create";
    }

    @PostMapping // VOY POR AQUÍ - NO VA -> pasar a requestParam
    public String create(@ModelAttribute Movie movie) {
        moviesService.create(movie);
        return "redirect:/movies";
    }

    /*
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
