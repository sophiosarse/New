class FantasyBook extends Book {
    private String mythologyCountry;

    public FantasyBook(String title, int pages, String author, boolean isHardcover, String mythologyCountry) {
        super(title, pages, author, isHardcover);
        this.mythologyCountry = mythologyCountry;
    }

    @Override
    public String toString() {
        return super.toString() + " (Mythology: " + mythologyCountry + ")";
    }
}