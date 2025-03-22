public class Car {
    private String manufacturer;
    private String model;
    private String licensePlate;
    private Engine engine;

    public Car(String manufacturer, String model, String licensePlate, Engine engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.licensePlate = licensePlate;
        this.engine = engine;
    }

    public void printInfo() {
        System.out.println("მწარმოებელი: " + manufacturer);
        System.out.println("მოდელი: " + model);
        System.out.println("სახელმწიფო ნომერი: " + licensePlate);
        engine.printInfo();
    }

    public int getEngineResource() {
        return engine.getResource();
    }
}
