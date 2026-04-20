package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Loan {

    private Long id;

    private Book book;

    private String clientName;

    private LocalDateTime loanDate;

    private LocalDateTime returnDate;

    public Loan (Long id, Book book, String clientName) {

        this.id = id;

        this.book = book;

        this.clientName = clientName;

        this.loanDate = LocalDateTime.now();

        this.returnDate = null;

    }

    public Long getId() {
        return id;
    }

    public String getClientName() {
        return clientName;
    }

    public Book getBook() {
        return book;
    }

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Loan loan = (Loan) object;
        return Objects.equals(id, loan.id) && Objects.equals(book, loan.book) && Objects.equals(clientName, loan.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, book, clientName);
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        return String.format("%d | %s | %s | %s - %s", getId(), getBook().getTitle(), getClientName(), getLoanDate().format(formatter), getReturnDate() != null ? getReturnDate().format(formatter) : null);
    }
}
