package model;

import model.enums.BookStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Book {

    private final Long id;

    private String title;

    private Author author;

    private BookStatus status;

    private final LocalDateTime registrationDate;

    private LocalDateTime updateDate;

    public Book(Long id, String title, Author author) {

        this.id = id;

        this.title = title;

        this.author = author;

        this.status = BookStatus.AVAILABLE;

        this.registrationDate = LocalDateTime.now();

        this.updateDate = LocalDateTime.now();

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        this.title = title;

        update();

    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {

        this.author = author;

        update();

    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {

        this.status = status;

        update();

    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    private void update() {

        this.updateDate = LocalDateTime.now();

    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && status == book.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, status);
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        return String.format("%d | %s | %s | %s | %s - %s", getId(), getTitle(), getAuthor().getName(), getStatus(), getRegistrationDate().format(formatter), getUpdateDate().format(formatter));

    }

}
