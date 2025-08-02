package filehandling;

import java.io.*;

public class task11 {
    public static void main(String[] args) {
        String filename = "nonexistentfile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("❌ File not found. Please check the file name.");
        } catch (IOException e) {
            System.out.println("⚠️ Error reading the file: " + e.getMessage());
        }
    }
}

