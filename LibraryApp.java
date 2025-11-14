import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    private Map<String, Integer> books = new HashMap<>();

    public Library() {
        books.put("Java Programming", 3);
        books.put("Data Structures", 0);
        books.put("Operating Systems", 2);
    }

    public void borrowBook(String bookName) throws BookNotAvailableException {
        if (!books.containsKey(bookName)) {
            throw new BookNotAvailableException("Book '" + bookName + "' does not exist in the library.");
        }
        int count = books.get(bookName);
        if (count == 0) {
            throw new BookNotAvailableException("Book '" + bookName + "' is currently out of stock.");
        } else {
            books.put(bookName, count - 1);
            System.out.println("Successfully borrowed: " + bookName);
        }
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        try {
            library.borrowBook("Java Programming");
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            library.borrowBook("Data Structures");
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            library.borrowBook("Artificial Intelligence");
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Loan processing completed.");
    }
}
