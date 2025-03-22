public class Library {
    private int id;
    private String name;

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("ბიბლიოთეკის ID: " + id);
        System.out.println("ბიბლიოთეკის სახელი: " + name);

        class Book {
            private int bookId;
            private String bookName;

            public Book(int bookId, String bookName) {
                this.bookId = bookId;
                this.bookName = bookName;
            }

            public void printBookInfo() {
                System.out.println("წიგნის ID: " + bookId);
                System.out.println("წიგნის სახელი: " + bookName);
            }
        }

        Book book = new Book(100, "Java5");
        book.printBookInfo();
    }
}