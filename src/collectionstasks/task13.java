package collectionstasks;

import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class task13 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Charlie", "Finance"));
        employees.add(new Employee("David", "IT"));
        employees.add(new Employee("Eva", "HR"));
        Map<String, List<Employee>> deptMap = new HashMap<>();

        for (Employee emp : employees) {
            deptMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }
        System.out.println("Employees grouped by department:");
        for (Map.Entry<String, List<Employee>> entry : deptMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

