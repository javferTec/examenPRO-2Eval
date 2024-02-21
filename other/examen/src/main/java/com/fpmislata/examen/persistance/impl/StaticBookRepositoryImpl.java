package com.fpmislata.examen.persistance.impl;

import com.fpmislata.examen.business.entity.Author;
import com.fpmislata.examen.business.entity.Book;
import com.fpmislata.examen.persistance.BookRepository;
import java.util.ArrayList;
import java.util.List;

public class StaticBookRepositoryImpl implements BookRepository {
    private List<Book> books;

    public StaticBookRepositoryImpl() {
        books = new ArrayList<>();
        books.add(new Book(1, "El nombre de la rosa", new Author(1, "Andreu"), "Siglo XIV. Fray Guillermo de Baskerville, monje franciscano y antiguo inquisidor, y su inseparable discípulo, el novicio Adso de Melk, visitan una abadía benedictina, situada en el norte de Italia, para esclarecer la muerte del joven miniaturista Adelmo de Otranto. Durante su estancia, desaparecen misteriosamente otros monjes que después aparecen muertos.","book1.jpg"));
        books.add(new Book(2,"La insoportable levedad del ser", new Author(2, "Javi"), "Praga, poco antes de la primavera del 1968. Tomas, un cirujano checo, es un hombre muy mujeriego que aspira a encontrar una felicidad que no se vea alterada por cuestiones como libertad, compromiso, consumismo...","book2.jpg"));
        books.add(new Book(3, "1Q84", new Author(3, "Richard"), "Se narra la historia de Aomame, una instructora de gimnasio y asesina, y Tengo, un profesor de matemáticas y aspirante a novelista. Ambos personajes, que rondan los treinta años, perciben desajustes en su entorno que los llevan a un destino común. La trama se desarrolla en el Japón de 1984, un mundo en apariencia normal pero con sutiles alteraciones. La historia se entrelaza con el universo de las sectas religiosas, el maltrato y la corrupción, con un estilo narrativo preciso y con ecos de George Orwell.", "book3.jpg"));
    }

    @Override
    public List<Book> all() {
        return this.books;
    }
    @Override
    public Book getById(int id) {
        Book book = getBook(id);
        return book;
    }
    private Book getBook(int id) {
        for (Book book: books) {
            if (book.getId() == id) {
                System.out.println(book);
                return book;
            }
        }
        return null;
    }
    @Override
    public int getMaxId() {
        int maxId = books.get(0).getId();
        for (Book book : books) {
            if (book.getId() > maxId) {
                maxId = book.getId();
            }
        }
        return maxId;
    }

    @Override
    public void insert(Book newBook) {
        books.add(newBook);
    }
}
