package co1n2;

class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Basics", "James Gosling");
        Book b2 = new Book(102, "Python 101", "Guido van Rossum");
        Book b3 = new Book(103, "C++ Mastery", "Bjarne Stroustrup");

        b1.display();
        b2.display();
        b3.display();
    }
}
