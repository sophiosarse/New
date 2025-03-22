import java.io.*;
import java.util.ArrayList;

public class Data {
    private static final String FILE_NAME = "phonebook.ser";
    public static void saveContacts(ArrayList<PhoneContact> contacts) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(contacts);
            System.out.println("Contacts have been saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<PhoneContact> loadContacts() {
        ArrayList<PhoneContact> contacts = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            contacts = (ArrayList<PhoneContact>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No saved contacts found or error reading the file.");
        }
        return contacts;
    }
}
