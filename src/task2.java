class Employee {
 static int count = 0;
 String name;
 Employee(String name) {
 this.name = name;
 count++; 
 }
 void show() {
 System.out.println("Employee Name: " + name);
 }
 static void showCount() {
 System.out.println("Total Employees: " + count);
 }
}
public class task2 {
 public static void main(String[] args) {
 Employee e1 = new Employee("Ajay");
 Employee e2 = new Employee("Vijay");
 e1.show();
 e2.show();
 Employee.showCount(); 
 }
}
