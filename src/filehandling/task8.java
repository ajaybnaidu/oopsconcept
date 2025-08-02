package filehandling;

import java.io.*;
import java.util.*;

public class task8 {
    private static final String FILE_NAME = "contacts.txt";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Contact Manager ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1 -> addContact();
                case 2 -> displayContacts();
                case 3 -> searchContact();
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
    private static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine().trim();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(name + "," + phone);
            writer.newLine();
            System.out.println("Contact saved.");
        } catch (IOException e) {
            System.out.println("Error saving contact: " + e.getMessage());
        }
    }
    private static void displayContacts() {
        System.out.println("\n--- Contact List ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 2);
                if (parts.length == 2) {
                    System.out.println("Name: " + parts[0] + ", Phone: " + parts[1]);
                    found = true;
                }
            }
            if (!found) System.out.println("No contacts found.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    private static void searchContact() {
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine().trim().toLowerCase();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 2);
                if (parts.length == 2 && parts[0].toLowerCase().contains(searchName)) {
                    System.out.println("Found -> Name: " + parts[0] + ", Phone: " + parts[1]);
                    found = true;
                }
            }
            if (!found) System.out.println("No contact found with name: " + searchName);
        } catch (IOException e) {
            System.out.println("Error searching contact: " + e.getMessage());
        }
    }
}
