// BookstoreSort.java
import java.util.*;

// Step 1: Define the Book class
class Book {
    String title;
    double price;
    int publicationYear;

    public Book(String title, double price, int publicationYear) {
        this.title = title;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return title + " | ₹" + price + " | " + publicationYear;
    }
}

public class BookstoreSort {
    public static void main(String[] args) {
        // Step 2: Create a list of Book objects
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Fundamentals", 450.0, 2021));
        books.add(new Book("Data Structures", 550.0, 2020));
        books.add(new Book("Algorithms Unlocked", 550.0, 2019));
        books.add(new Book("Clean Code", 700.0, 2008));
        books.add(new Book("Effective Java", 450.0, 2018));

        // Step 3: Implement custom Comparator
        Comparator<Book> bookComparator = (b1, b2) -> {
            // First: compare by price descending
            int priceCompare = Double.compare(b2.price, b1.price);
            if (priceCompare != 0) return priceCompare;
            // Second: if prices are equal, compare by title alphabetically
            return b1.title.compareToIgnoreCase(b2.title);
        };

        // Step 4: Sort and display
        Collections.sort(books, bookComparator);

        System.out.println("📚 Books sorted by Price (descending) and Title (A–Z):");
        books.forEach(System.out::println);
    }
}
