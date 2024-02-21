package es.cesguiro.proyect1daw.controller;

import es.cesguiro.proyect1daw.common.IoCContainer.BookIoCContainer;
import es.cesguiro.proyect1daw.domain.entity.Book;
import es.cesguiro.proyect1daw.domain.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping(BookController.URL)
public class BookController {

    public static final String URL = "/books";
    private final BookService bookService;

    public BookController() {
        this.bookService = BookIoCContainer.getBookService();
    }

    @GetMapping()
    public String findAll(){
        List<Book> bookList = bookService.findAll();
        System.out.println(bookList.get(0));
        return "bookList";
    }
}
