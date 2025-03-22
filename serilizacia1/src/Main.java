import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country[] countries = new Country[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of country " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter the population of " + name + ": ");
            int population = scanner.nextInt();

            System.out.print("Enter the area of " + name + ": ");
            double area = scanner.nextDouble();
            scanner.nextLine();

            countries[i] = new Country(name, population, area);
        }

        SerializeCountries serializeCountries = new SerializeCountries();
        serializeCountries.serialize(countries);

        DeserializeCountries deserializeCountries = new DeserializeCountries();
        deserializeCountries.deserialize();
    }
}
