package service;

import model.Student;
import service.StudentService;
public class Main {
 public static void main(String[] args) {
 Student s = new Student();
 s.name = "Ajay";
 s.age = 23;
 StudentService ss = new StudentService();
 ss.printStudent(s);
 }
}
