package filehandling;

import java.io.Serializable;

public class task10 implements Serializable {
    private String name;
    private int rollNo;
    private double marks;

    public task10(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks;
    }
}

