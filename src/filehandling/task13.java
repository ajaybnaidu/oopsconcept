package filehandling;

import java.io.*;
import java.nio.file.*;

public class task13 {
    public static void main(String[] args) {
        String inputFile = "data.txt";
        String outputFile = "output.txt";

        try {

            String content = new String(Files.readAllBytes(Paths.get(inputFile)));


            String updatedContent = content.replaceAll("Java", "Python");

            Files.write(Paths.get(outputFile), updatedContent.getBytes());

            System.out.println("✅ All instances of 'Java' replaced with 'Python' in output.txt");
        } catch (IOException e) {
            System.out.println("❌ Error processing file: " + e.getMessage());
        }
    }
}

