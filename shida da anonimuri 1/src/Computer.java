public class Computer {
    private String manufacturerCountry;
    private String brand;
    private double price;
    private boolean hasWarranty;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(String manufacturerCountry, String brand, double price, boolean hasWarranty, Monitor monitor, Motherboard motherboard) {
        this.manufacturerCountry = manufacturerCountry;
        this.brand = brand;
        this.price = price;
        this.hasWarranty = hasWarranty;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void printInfo() {
        System.out.println("მწარმოებელი ქვეყანა: " + manufacturerCountry);
        System.out.println("ბრენდი: " + brand);
        System.out.println("ფასი: " + price + " ლარი");
        System.out.println("საგარანტიო მომსახურეობა: " + (hasWarranty ? "აქვს" : "არ აქვს"));
        System.out.println("\nმონიტორის ინფორმაცია:");
        monitor.printInfo();
        System.out.println("\nდედაპლატის ინფორმაცია:");
        motherboard.printInfo();
    }
}
