public class MathUtility {
    public double calculateSquareRoot(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Error: Cna not accept negative number");
        }
        return Math.sqrt(number);
    }
}
