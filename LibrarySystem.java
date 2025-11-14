package co3;

import java.io.*;

public class LibrarySystem {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("books.txt"));
             FileWriter fw = new FileWriter("available_books.txt")) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("B1")) {
                    fw.write(line + "\n");
                    count++;
                }
            }
            System.out.println("✅ " + count + " books processed and written to available_books.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
