import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PhoneContact> contacts = Data.loadContacts();

        while (true) {
            System.out.println("\nPhonebook Menu:");
            System.out.println("1. Add a contact");
            System.out.println("2. Edit a contact");
            System.out.println("3. Delete a contact");
            System.out.println("4. Display all contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addContact(scanner, contacts);
                    break;
                case 2:
                    editContact(scanner, contacts);
                    break;
                case 3:
                    deleteContact(scanner, contacts);
                    break;
                case 4:
                    displayContacts(contacts);
                    break;
                case 5:
                    Data.saveContacts(contacts);
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void addContact(Scanner scanner, ArrayList<PhoneContact> contacts) {
        if (contacts.size() >= 30) {
            System.out.println("Phonebook is full. Cannot add more contacts.");
            return;
        }

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        PhoneContact newContact = new PhoneContact(firstName, lastName, phoneNumber, email);
        contacts.add(newContact);
        Data.saveContacts(contacts);
        System.out.println("Contact added.");
    }

    private static void editContact(Scanner scanner, ArrayList<PhoneContact> contacts) {
        System.out.print("Enter the index of the contact to edit (0 to " + (contacts.size() - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= contacts.size()) {
            System.out.println("Invalid index.");
            return;
        }

        PhoneContact contact = contacts.get(index);
        System.out.println("Editing contact: " + contact);

        System.out.print("Enter new first name (or press Enter to keep current): ");
        String firstName = scanner.nextLine();
        if (!firstName.isEmpty()) contact.setFirstName(firstName);

        System.out.print("Enter new last name (or press Enter to keep current): ");
        String lastName = scanner.nextLine();
        if (!lastName.isEmpty()) contact.setLastName(lastName);

        System.out.print("Enter new phone number (or press Enter to keep current): ");
        String phoneNumber = scanner.nextLine();
        if (!phoneNumber.isEmpty()) contact.setPhoneNumber(phoneNumber);

        System.out.print("Enter new email (or press Enter to keep current): ");
        String email = scanner.nextLine();
        if (!email.isEmpty()) contact.setEmail(email);

        Data.saveContacts(contacts);
        System.out.println("Contact updated.");
    }

    private static void deleteContact(Scanner scanner, ArrayList<PhoneContact> contacts) {
        System.out.print("Enter the index of the contact to delete (0 to " + (contacts.size() - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= contacts.size()) {
            System.out.println("Invalid index.");
            return;
        }

        contacts.remove(index);
        Data.saveContacts(contacts);  
        System.out.println("Contact deleted.");
    }

    private static void displayContacts(ArrayList<PhoneContact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contacts:");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println(i + ": " + contacts.get(i));
            }
        }
    }
}
