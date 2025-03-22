class Book {
    private String title;
    private int pages;
    private String author;
    private boolean isHardcover;

    public Book(String title, int pages, String author, boolean isHardcover) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.isHardcover = isHardcover;
    }

    public void read() {
        System.out.println("მე ვკითხულობ " + title + " წიგნს");
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + pages + " pages, " + (isHardcover ? "Hardcover" : "Paperback") + ")";
    }
}