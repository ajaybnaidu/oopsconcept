package filehandling;

import java.io.*;

public class StudentSerializationDemo {
    public static void main(String[] args) {
        Student student = new Student("Rahul", 101, 87.5);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(student);
            System.out.println("Object serialized and written to student.ser");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("\nDeserialized Student:");
            System.out.println("Name: " + deserializedStudent.getName());
            System.out.println("Roll No: " + deserializedStudent.getRollNo());
            System.out.println("Marks: " + deserializedStudent.getMarks());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}

