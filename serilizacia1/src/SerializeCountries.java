import java.io.*;

public class SerializeCountries {

    public void serialize(Country[] countries) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("countries.txt"))) {
            oos.writeObject(countries);
            System.out.println("Countries have been serialized to countries.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}