class BookGiver extends Employee {
    private int startHour;
    private int endHour;

    public BookGiver(String firstName, String lastName, int id, int startHour, int endHour) {
        super(firstName, lastName, id);
        this.startHour = startHour;
        this.endHour = endHour;
    }

    @Override
    public String toString() {
        return super.toString() + " (Works from " + startHour + " to " + endHour + ")";
    }
}