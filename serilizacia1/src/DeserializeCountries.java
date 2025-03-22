import java.io.*;

public class DeserializeCountries {

    public void deserialize() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("countries.txt"))) {
            Country[] deserializedCountries = (Country[]) ois.readObject();

            System.out.println("\nDeserialized countries:");
            for (Country country : deserializedCountries) {
                System.out.println(country);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}