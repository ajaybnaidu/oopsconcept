package filehandling;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed text: " + reversed);

        scanner.close();
    }
}
