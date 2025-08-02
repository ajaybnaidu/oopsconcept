package collectionstasks;

import java.util.HashMap;
import java.util.Map;

public class task6 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "Diana");
        students.put(105, "Ethan");
        students.remove(103); 
        System.out.println("Student Roll Numbers and Names:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

