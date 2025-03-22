import java.util.ArrayList;
import java.util.List;

class Library {
    private String name;
    private List<Employee> employees;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();
        sB.append("Library Name: ").append(name).append("\n");
        sB.append("Employees:\n");
        for (Employee employee : employees) {
            sB.append("    *").append(employee).append("\n");
        }
        sB.append("Books:\n");
        for (Book book : books) {
            sB.append("  - ").append(book).append("\n");
        }
        return sB.toString();
    }
}