package filehandling;

import java.io.*;

public class task4 {
    public static void main(String[] args) {
        String sourceFile = "info.txt";
        String destFile = "copy.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destFile));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); 
            }
            reader.close();
            writer.close();
            System.out.println("Content copied successfully from " + sourceFile + " to " + destFile);
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
