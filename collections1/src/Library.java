import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void populateList(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                String bookName = parts[0];
                int numberOfPages = Integer.parseInt(parts[1]);

                books.add(new Book(bookName, numberOfPages));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
    }
}
