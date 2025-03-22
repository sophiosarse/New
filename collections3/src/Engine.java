public class Engine {
    private String fuelType;
    private int cylinders;
    private double volume;

    public Engine(String fuelType, int cylinders, double volume) {
        this.fuelType = fuelType;
        this.cylinders = cylinders;
        this.volume = volume;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Fuel Type: " + fuelType + ", Cylinders: " + cylinders + ", Volume: " + volume + "L";
    }
}
