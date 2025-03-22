package first;

class Polygon {
    protected int sides;
    protected double length;

    public Polygon(int sides, double length) {
        this.sides = sides;
        this.length = length;
    }
    public double Perimeter() {
        return sides * length;
    }
}