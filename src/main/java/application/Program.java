package application;

import controller.LibraryController;
import controller.LoanController;
import model.Library;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LibraryController controller = new LibraryController();

        Library library = new Library();

        while (true) {

            System.out.println("=====================");
            System.out.println("    Library System   ");
            System.out.println("=====================");

            System.out.println("1 - List Books");
            System.out.println("2 - Exit");
            System.out.println("=====================");


            System.out.print("choice: ");
            int choice = scanner.nextInt();

            scanner.nextLine();

            if (choice == 2) {

                System.out.println("Good Bye!");

                break;

            } else {

                controller.listBook(library);

                System.out.print("Make Loan? (n/y) ");
                char makeLoan = scanner.nextLine().charAt(0);

                if (makeLoan == 'y') {

                    LoanController loanController = new LoanController();

                    try {

                        System.out.print("Enter the Book's Id: ");
                        Long bookId = scanner.nextLong();

                        scanner.nextLine();

                        System.out.print("Enter your name: ");
                        String clientName = scanner.nextLine();

                        loanController.makeLoan(library, bookId, clientName);

                    } catch (RuntimeException e) {

                        System.out.println("Invalid Id");

                    }

                }

            }

        }

        scanner.close();

    }

}
