package controller;

import model.Library;
import model.enums.BookStatus;

public class LibraryController {

    public void listBook (Library library) {

        library.getBooks().stream().filter(book -> book.getStatus().equals(BookStatus.AVAILABLE)).forEach(System.out::println);

    }

}
