import java.lang.Math;

public class QuadraticEquation {
    private double a, b, c;
    private Double x1, x2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        solveEquation();
    }

    private void solveEquation() {
        double d = b * b - 4 * a * c;

        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
        } else if (d == 0) {
            x1 = x2 = -b / (2 * a);
        } else {
            x1 = x2 = null;
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        QuadraticEquation other = (QuadraticEquation) obj;
        return (x1 != null && x1.equals(other.x1) && x2 != null && x2.equals(other.x2)) ||
                (x1 == null && x2 == null && other.x1 == null && other.x2 == null);
    }

    @Override
    public String toString() {
        if (x1 == null || x2 == null) {
            return "No real solutions";
        }
        return "Equation: " + a + "x² + " + b + "x + " + c + " = 0\nSolutions: x1 = " + x1 + ", x2 = " + x2;
    }

    public Double getX1() {
        return x1;
    }

    public Double getX2() {
        return x2;
    }

}
