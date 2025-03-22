package Second;

class Rectangle extends Shape {

    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public void printInfo() {
        System.out.println("ფიგურა: Rectangle");
        System.out.println("x = " + x + ", y = " + y);
    }

    @Override
    public double Perimeter() {
        return 2 * (x + y);
    }
}