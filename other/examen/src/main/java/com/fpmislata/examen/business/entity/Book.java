package com.fpmislata.examen.business.entity;

public class Book {
    private int id;
    private String title;
    private Author author;
    private String summary;
    private String image = "no-image.png";
    public Book() {}

    public Book(int id, String title, Author author, String summary, String image) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.image = image;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public String getSummary() {
        return summary;
    }
    public String getImage() {
        return image;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", summary='" + summary + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
