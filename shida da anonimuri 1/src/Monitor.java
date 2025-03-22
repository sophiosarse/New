public class Monitor {
    private double diagonalSize;
    private String resolution;
    private int refreshRate;

    public Monitor(double diagonalSize, String resolution, int refreshRate) {
        this.diagonalSize = diagonalSize;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
    }

    public void printInfo() {
        System.out.println("დიაგონალი: " + diagonalSize + " დუიმი");
        System.out.println("რეზოლუცია: " + resolution);
        System.out.println("განახლების სიხშირე: " + refreshRate + " ჰერცი");
    }
}
