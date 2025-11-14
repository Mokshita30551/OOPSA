package co1n2;

class Library {
    int libraryId;
    String name;
    int totalBooks;

    Library(int id, String name, int totalBooks) {
        this.libraryId = id;
        this.name = name;
        this.totalBooks = totalBooks;
    }

    Library(int id, String name) {
        this(id, name, 0); // overloaded constructor
    }

    void display() {
        System.out.println("Library ID: " + libraryId + ", Name: " + name + ", Books: " + totalBooks);
    }

    public static void main(String[] args) {
        Library l1 = new Library(1, "Central Library", 5000);
        Library l2 = new Library(2, "Community Library");

        l1.display();
        l2.display();
    }
}
