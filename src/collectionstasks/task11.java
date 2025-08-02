package collectionstasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }
    public String toString() {
        return name + " - " + marks;
    }
}

public class task11 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 72));
        students.add(new Student("Charlie", 90));
        students.add(new Student("David", 68));
        Collections.sort(students);
        System.out.println("Students sorted by marks (ascending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

