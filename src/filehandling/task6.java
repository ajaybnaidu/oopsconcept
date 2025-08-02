package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class task6 {
    public static void main(String[] args) {
        String logFile = "app.log";
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);
        String logMessage = "[" + timestamp + "] Application started";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            writer.write(logMessage);
            writer.newLine();
            System.out.println("Log entry added to app.log");
        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }
}

