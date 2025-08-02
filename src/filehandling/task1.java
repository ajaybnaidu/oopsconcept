package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class task1 {
    public static void main(String[] args) {
        String fileName = "info.txt";

        try {
            FileWriter writer = new FileWriter(fileName); 
            writer.write("Java I/O is powerful!\n");
            writer.close();
            FileWriter appender = new FileWriter(fileName, true); 
            appender.write("Learn Java step-by-step\n");
            appender.close();

            System.out.println("Content written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

