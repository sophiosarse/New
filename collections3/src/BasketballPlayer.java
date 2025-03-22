public class BasketballPlayer {
    private String firstName;
    private String lastName;
    private int pointsScored;
    private int rebounds;
    private int blocks;
    private int assists;
    private int turnovers;

    public BasketballPlayer(String firstName, String lastName, int pointsScored, int rebounds, int blocks, int assists, int turnovers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pointsScored = pointsScored;
        this.rebounds = rebounds;
        this.blocks = blocks;
        this.assists = assists;
        this.turnovers = turnovers;
    }

    public double calculateRating() {
        return pointsScored * 1 + rebounds * 1 + assists * 1.5 + blocks * 2 - turnovers * 2;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | Rating: " + calculateRating();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPointsScored() {
        return pointsScored;
    }

    public int getRebounds() {
        return rebounds;
    }

    public int getBlocks() {
        return blocks;
    }

    public int getAssists() {
        return assists;
    }

    public int getTurnovers() {
        return turnovers;
    }
}
