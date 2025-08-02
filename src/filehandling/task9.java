package filehandling;

import java.io.*;

public class task9 {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
                charCount += line.replaceAll("\\s", "").length();
            }

            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces): " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

