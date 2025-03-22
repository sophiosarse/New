public class NumberValidator {
    public void checkForNegative(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Error: Can not accept negative number");
        }
    }
}
