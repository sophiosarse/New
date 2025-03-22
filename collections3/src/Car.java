import java.util.*;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private Engine engine;

    public Car(String brand, String model, int year, double mileage, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Mileage: " + mileage + " km, Engine: [" + engine + "]";
    }
}
