import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Central Library");

        Cleaner cleaner = new Cleaner("Clea", "Ner", 123);
        BookGiver issuer = new BookGiver("Book", "Giver", 234, 9, 17);
        SilenceController controller = new SilenceController("Silence", "Controller", 345, 8.5);
        BookAdvisor advisor = new BookAdvisor("Book", "Advisor", 456, 9.0, library);

        library.addEmployee(cleaner);
        library.addEmployee(issuer);
        library.addEmployee(controller);
        library.addEmployee(advisor);

        AdventureBook adventureBook = new AdventureBook("Treasure Island", 300, "R.L. Stevenson", true);
        ScienceBook scienceBook = new ScienceBook("A Brief History of Time", 212, "Stephen Hawking", false, "Physics");
        FantasyBook fantasyBook = new FantasyBook("The Hobbit", 310, "J.R.R. Tolkien", true, "England");

        library.addBook(adventureBook);
        library.addBook(scienceBook);
        library.addBook(fantasyBook);

        System.out.println(library);

        Book recommendedBook = advisor.recommendBook();
        if (recommendedBook != null) {
            System.out.println("Recommended book: " + recommendedBook);
        } else {
            System.out.println("No books available to recommend.");
        }
    }
}