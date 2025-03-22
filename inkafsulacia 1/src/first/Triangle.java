package first;

class Triangle extends Polygon {
    public Triangle(double length) {
        super(3, length);
    }

    @Override
    public double Perimeter() {
        return 3 * length;
    }
    public double Area() {
        return (Math.sqrt(3) / 4) * length * length;
    }
}