import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("First number: ");
//        int num1 = scanner.nextInt();
//        System.out.print("Second number: ");
//        int num2 = scanner.nextInt();
//        Division divisionHandler = new Division();
//        divisionHandler.divide(num1, num2);
//
//        scanner.close();

        //2

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Number: ");
//        String input = scanner.nextLine();
//        DivideString divisionHandler = new DivideString();
//        divisionHandler.divide(input);
//
//        scanner.close();

//        //3
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("number: ");
//        int number = scanner.nextInt();
//
//        // NumberValidator კლასის ობიექტის შექმნა
//        NumberValidator validator = new NumberValidator();
//
//        try {
//            validator.checkForNegative(number);
//            System.out.println("Number: " + number);
//        } catch (NegativeNumberException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            scanner.close();
//        }

        //4
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        MathUtility mathUtility = new MathUtility();
        try {
            double result = mathUtility.calculateSquareRoot(number);
            System.out.println("Answer: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}