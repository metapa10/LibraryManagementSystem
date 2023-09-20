import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Book {
    private int id;
    private String title;
    private String author;
    private boolean isCheckedOut;

    // Constructor, getters, and setters
}

class Borrower {
    private int id;
    private String name;
    private String contact;

    // Constructor, getters, and setters
}

class Transaction {
    private int id;
    private Book book;
    private Borrower borrower;
    private Date checkoutDate;
    private Date dueDate;
    private Date returnDate;

    // Constructor, getters, and setters
}

public class LibraryManagementSystem {
    private static List<Book> books = new ArrayList<>();
    private static List<Borrower> borrowers = new ArrayList<>();
    private static List<Transaction> transactions = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Borrower");
            System.out.println("3. Check Out Book");
            System.out.println("4. Check In Book");
            System.out.println("5. View Books");
            System.out.println("6. View Borrowers");
            System.out.println("7. View Transactions");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    addBorrower(scanner);
                    break;
                case 3:
                    checkOutBook(scanner);
                    break;
                case 4:
                    checkInBook(scanner);
                    break;
                case 5:
                    viewBooks();
                    break;
                case 6:
                    viewBorrowers();
                    break;
                case 7:
                    viewTransactions();
                    break;
                case 8:
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
