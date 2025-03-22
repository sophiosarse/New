package first;

class Square extends Polygon {
    public Square(double length) {
        super(4, length);
    }

    @Override
    public double Perimeter() {
        return 4 * length;
    }
    public double Area() {
        return length * length;
    }
}
