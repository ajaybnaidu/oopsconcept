package wrapperclass;

import java.util.ArrayList;
import java.util.Collections;

public class task6 {

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(72);
        marks.add(90);
        marks.add(65);
        marks.add(78);

        System.out.println("Original Marks: " + marks);

        int minMark = Collections.min(marks);
        marks.remove(Integer.valueOf(minMark));  
        int max = marks.get(0);
        int min = marks.get(0);
        int sum = 0;

        for (int i = 0; i < marks.size(); i++) {
            int mark = marks.get(i); 
            if (mark > max) {
                max = mark;
            }
            if (mark < min) {
                min = mark;
            }
            sum += mark;
        }
        double average = (double) sum / marks.size();
        System.out.println("Marks after removing lowest: " + marks);
        System.out.println("Max mark: " + max);
        System.out.println("Min mark: " + min);
        System.out.println("Average mark: " + average);
    }
}
