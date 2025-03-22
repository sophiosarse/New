package Second;
public class Triangle extends Shape {
    private double z;

    public Triangle(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void printInfo() {
        System.out.println("ფიგურა: Triangle");
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }

    @Override
    public double Perimeter() {
        return x + y + z;
    }
}