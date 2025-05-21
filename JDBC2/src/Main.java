import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthService authService = new AuthService();

        while (true) {
            System.out.println("\n1. რეგისტრაცია");
            System.out.println("2. ავტორიზაცია");
            System.out.println("0. გამოსვლა");
            System.out.print("აირჩიე: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            try {
                if (choice == 1) {
                    System.out.print("მომხმარებელი: ");
                    String username = scanner.nextLine();
                    System.out.print("პაროლი: ");
                    String password = scanner.nextLine();
                    System.out.print("სახელი: ");
                    String firstName = scanner.nextLine();
                    System.out.print("გვარი: ");
                    String lastName = scanner.nextLine();

                    authService.register(username, password, firstName, lastName);
                } else if (choice == 2) {
                    System.out.print("მომხმარებელი: ");
                    String username = scanner.nextLine();
                    System.out.print("პაროლი: ");
                    String password = scanner.nextLine();

                    authService.login(username, password);
                } else if (choice == 0) {
                    System.out.println("ნახვამდის!");
                    break;
                } else {
                    System.out.println("არასწორი არჩევანი!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}
