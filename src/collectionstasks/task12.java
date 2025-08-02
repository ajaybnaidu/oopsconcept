package collectionstasks;

import java.util.*;
class Student9 {
 String name;
 int marks;

 Student9(String name, int marks) {
     this.name = name;
     this.marks = marks;
 }

 public String toString() {
     return name + " - " + marks;
 }
}

public class task12 {
 public static void main(String[] args) {
     List<Student> students = new ArrayList<>();
     students.add(new Student("Charlie", 90));
     students.add(new Student("Alice", 85));
     students.add(new Student("David", 68));
     students.add(new Student("Bob", 72));
     Collections.sort(students, new Comparator<Student>() {
         public int compare(Student s1, Student s2) {
             return s1.name.compareTo(s2.name);
         }
     });
     System.out.println("Students sorted by name (A-Z):");
     for (Student s : students) {
         System.out.println(s);
     }
 }
}

