package com.fpmislata.examen.controller;

import com.fpmislata.examen.business.entity.Actor;
import com.fpmislata.examen.business.entity.Director;
import com.fpmislata.examen.business.entity.Movie;
import com.fpmislata.examen.business.service.ActorService;
import com.fpmislata.examen.business.service.DirectorService;
import com.fpmislata.examen.business.service.MovieService;
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
        //List<Movie> movies = moviesService.findAll();
        model.addAttribute("movies", moviesService.findAll());
        return "listAll";
    }

    // MOSTRAR POR ID
    @GetMapping("/{id}")
    public String findById(@PathVariable("id") UUID id, Model model) {
        //Movie movie = moviesService.findById(id);
        model.addAttribute("movie", moviesService.findById(id));
        return "listById";
    }


    // CREAR
    @GetMapping("/add")
    public String showFormToCreate(Model model) {
        //List<Director> directors = directorService.findAll();
        //List<Actor> actors = actorService.findAll();
        model.addAttribute("actors", directorService.findAll());
        model.addAttribute("directors", actorService.findAll());
        model.addAttribute("movie", new Movie());
        return "create";
    }

    @PostMapping
    public String create(@ModelAttribute Movie movie, @RequestParam String title, @RequestParam int year,
                         @RequestParam String description, @RequestParam int runtime, @RequestParam Integer directorId,
                         @RequestParam Integer[] actors, @RequestParam String image) {

        Director director = directorService.findById(directorId);
        List<Actor> actorList = actorService.findByIds(actors);
        moviesService.create(title, year, description, runtime,director,actorList, image);
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
