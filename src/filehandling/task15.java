package filehandling;

import java.io.File;

public class task15 {
    public static void main(String[] args) {
        String path = "C:\\Your\\Directory\\Path"; 

        File dir = new File(path);

        if (dir.exists() && dir.isDirectory()) {
            File[] contents = dir.listFiles();

            System.out.println("📂 Scanning Directory: " + dir.getAbsolutePath());
            System.out.println("-------------------------------------------------");

            if (contents != null && contents.length > 0) {
                for (File file : contents) {
                    String type = file.isDirectory() ? "Directory" : "File";
                    long size = file.isFile() ? file.length() : 0; 

                    System.out.println(type + " | " + file.getName() + " | Size: " + size + " bytes");
                }
            } else {
                System.out.println("The directory is empty.");
            }

        } else {
            System.out.println(" The specified path is not a valid directory.");
        }
    }
}

