package filehandling;

import java.io.*;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("userdata.txt"))) {
            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Email: " + email);
            writer.newLine();
            writer.write("Address: " + address);
            writer.newLine();

            System.out.println("User data saved to userdata.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        scanner.close();
    }
}

