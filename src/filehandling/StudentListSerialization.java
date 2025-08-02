package filehandling;

import java.io.*;
import java.util.ArrayList;

public class StudentListSerialization {
    public static void main(String[] args) {
        String filename = "students.ser";
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Rahul", 101, 85.5));
        students.add(new Student("Anita", 102, 90.0));
        students.add(new Student("Vikram", 103, 88.2));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(students);
            System.out.println("Students serialized successfully into " + filename);
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            ArrayList<Student> deserializedStudents = (ArrayList<Student>) ois.readObject();
            System.out.println("\nDeserialized Student List:");
            for (Student s : deserializedStudents) {
                System.out.println(s);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
}

