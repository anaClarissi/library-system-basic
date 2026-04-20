package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    private List<Author> authors = new ArrayList<>();

    private List<Loan> loans = new ArrayList<>();

    public Library () {

        authors.add(new Author(1L, "Clarice Lispector", LocalDate.parse("1920-12-10")));
        authors.add(new Author(2L, "Machado de Assis", LocalDate.parse("1839-06-21")));
        authors.add(new Author(3L, "Carlos Drummons", LocalDate.parse("1902-10-31")));
        authors.add(new Author(4L, "Monteiro Lobato", LocalDate.parse("1882-05-18")));
        authors.add(new Author(5L, "William Shakespeare", LocalDate.parse("1564-05-10")));

        books.add(new Book(1L, "A Hora da Estrela", authors.get(0)));
        books.add(new Book(2L, "Água Viva", authors.get(0)));

        books.add(new Book(3L, "Dom Casmurro", authors.get(1)));
        books.add(new Book(4L, "O Alienista", authors.get(1)));

        books.add(new Book(5L, "Alguma Poesia", authors.get(2)));
        books.add(new Book(6L, "Sentimento do Mundo", authors.get(2)));

        books.add(new Book(7L, "Memórias da Emília", authors.get(3)));
        books.add(new Book(8L, "Caçadas de Pedrinho", authors.get(3)));

        books.add(new Book(9L, "Romeu e Julieta", authors.get(4)));
        books.add(new Book(10L, "A Tempestade", authors.get(4)));

    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Loan> getLoans() {
        return loans;
    }
}
