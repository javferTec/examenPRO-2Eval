package com.fpmislata.examen.controller;

import com.fpmislata.examen.business.entity.Author;
import com.fpmislata.examen.business.entity.Book;
import com.fpmislata.examen.business.service.BooksService;
import com.fpmislata.examen.business.service.impl.BooksServiceImpl;
import com.fpmislata.examen.common.BookIoCContainer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RequestMapping("/libros")
@Controller
public class BookController {
    private final BooksService service;
    public BookController() {
        this.service = BookIoCContainer.getBookService();
    }




    @GetMapping("")
    public String getAll(Model model) {
        List<Book> books = this.service.getAll();
        System.out.println(books);
        model.addAttribute("books", books);
        return "books";
    }
    @GetMapping("/{id}")
    public String getById(@PathVariable("id") int id, Model model) {
        Book book = this.service.getById(id);
        System.out.println(book);
        model.addAttribute("book", book);
        return "bookDetails";
    }
    @GetMapping("/crear")
    public String formBook(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        return "bookAdd";
    }

    // LA IMAGEN PARA QUE SE SUBA Y SE VEA TIENE QUE TENER EL DIRECTORIO CREADO "C:/libro/resources/" - EN UN SERVER EL DIRECTORIO ESTARÍA CREADO Y FUNCIONARÍA. CADA LIBRO TIENE UNA IMAGEN ASOCIADA
    @PostMapping("")
    public String addNewBook(@ModelAttribute Book book, @RequestParam String title, @RequestParam Author author, @RequestParam String summary, @RequestParam(value = "image") MultipartFile image) {
        List<Book> books = this.service.getAll();
        int id = setLastId();
        if(!image.isEmpty()) {
            String absolutePath = "C://libro//resources";
            System.out.println("absolutePath -> " + absolutePath);
            try {
                byte[] byteImg = image.getBytes();
                Path completePath = Paths.get(absolutePath + "//" + image.getOriginalFilename());
                Files.write(completePath, byteImg);
                Book newBook = new Book(id, title, new Author(0, "Default"), summary, image.getOriginalFilename());
                service.insert(newBook);
            } catch (IOException e) {
                System.out.println("Error al guardar la imagen");
                throw new RuntimeException(e);
            }
        }
        return "redirect:/libros";
    }

    private int setLastId() {
        int id = this.service.getMaxId();
        return id + 1;
    }

    @GetMapping("/eliminar/{id}")
    public String deleteById(@PathVariable("id") int id, Model model) {
        List<Book> books = this.service.getAll();
        for (Book book : books) {
            if (book.getId() == id) {
                System.out.println(book);
                books.remove(book);
                return "redirect:/";
            }
        }
        return "redirect:/error";
    }

}
