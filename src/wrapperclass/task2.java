package wrapperclass;

import java.util.ArrayList;
import java.util.List;

public class task2 {

    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.5);
        doubleList.add(20.0);
        doubleList.add(30.75);
        doubleList.add(15.25);
        double sum = 0.0;
        for (int i = 0; i < doubleList.size(); i++) {
            double value = doubleList.get(i); 
            sum += value;
        }
        double average = sum / doubleList.size();
        System.out.println("Values in List: " + doubleList);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
