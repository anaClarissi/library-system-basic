package controller;

import model.Book;
import model.Library;
import model.Loan;
import model.enums.BookStatus;

public class LoanController {

    public void makeLoan(Library library, Long bookId, String clientName) {

        Long id = library.getLoans().stream().map(Loan::getId).max(Long::compareTo).orElse(0L) + 1L;

        Book book = library.getBooks().stream().filter(b -> b.getId().equals(bookId)).findFirst().orElseThrow(() -> new RuntimeException("Error"));

        if (book.getStatus().equals(BookStatus.AVAILABLE)) {

            Loan loan = new Loan(id, book, clientName);

            library.getLoans().add(loan);

            library.getBooks().stream().filter(b -> b.getId().equals(bookId)).findFirst().orElseThrow(() -> new RuntimeException("error")).setStatus(BookStatus.UNAVAILABLE);

            System.out.println(loan);

            System.out.println("Loan finish!");

        } else {

            System.out.println("Book Invalid");

        }

    }

}
