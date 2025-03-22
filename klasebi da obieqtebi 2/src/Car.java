public class Car {
    String make;
    String model;
    int year;
    String number;

    public Car(String make, String model, int year, String number) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.number = number;
    }

    public void printInfo() {
        System.out.println("მანქანა: " + make);
        System.out.println("მოდელი: " + model);
        System.out.println("გამოშვების წელი: " + year);
        System.out.println("მანქანის ნომერი: " + number);
    }
}
