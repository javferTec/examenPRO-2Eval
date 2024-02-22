package com.fpmislata.examen.controller;

import com.fpmislata.examen.common.container.BookIoC;
import com.fpmislata.examen.domain.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(BookController.URL)
@Controller
public class BookController {
    public static final String URL = "/books";
    private final BookService bookService;
    public BookController() {
        this.bookService = BookIoC.getBookService();
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "books";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") int id, Model model) {
        model.addAttribute("book", bookService.findById(id));
        return "bookDetails";
    }
}
