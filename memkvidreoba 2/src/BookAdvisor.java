import java.util.List;
import java.util.Random;

class BookAdvisor extends Employee {
    private double rating;
    private Library library;

    public BookAdvisor(String firstName, String lastName, int id, double rating, Library library) {
        super(firstName, lastName, id);
        this.rating = rating;
        this.library = library;
    }

    public Book recommendBook() {
        List<Book> books = library.getBooks();
        if (books.isEmpty()) return null;
        Random random = new Random();
        return books.get(random.nextInt(books.size()));
    }

    @Override
    public String toString() {
        return super.toString() + " (Rating: " + rating + ")";
    }
}