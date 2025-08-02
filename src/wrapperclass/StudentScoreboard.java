package wrapperclass;

import java.util.*;

public class StudentScoreboard {

    public static void main(String[] args) {
        Map<String, List<Integer>> studentScores = new HashMap<>();
        List<Integer> marks1 = new ArrayList<>();
        marks1.add(85);
        marks1.add(90);
        marks1.add(78);
        studentScores.put("Alice", marks1);

        List<Integer> marks2 = new ArrayList<>();
        marks2.add(88);
        marks2.add(92);
        marks2.add(95);
        studentScores.put("Bob", marks2);

        List<Integer> marks3 = new ArrayList<>();
        marks3.add(70);
        marks3.add(75);
        marks3.add(80);
        studentScores.put("Charlie", marks3);
        String topScorer = null;
        double highestAvg = 0.0;

        System.out.println("Student Report:");
        System.out.println("-----------------------------");
        Set<String> keys = studentScores.keySet();
        for (Iterator<String> it = keys.iterator(); it.hasNext();) {
            String student = it.next();
            List<Integer> scores = studentScores.get(student);

            int sum = 0;
            int max = scores.get(0);
            for (int i = 0; i < scores.size(); i++) {
                int mark = scores.get(i);  
                sum += mark;
                if (mark > max) {
                    max = mark;
                }
            }

            double average = (double) sum / scores.size();
            System.out.println("Name: " + student);
            System.out.println("Scores: " + scores);
            System.out.println("Average: " + average);
            System.out.println("Max Score: " + max);
            System.out.println();
            if (average > highestAvg) {
                highestAvg = average;
                topScorer = student;
            }
        }
        System.out.println("-----------------------------");
        System.out.println("Top Scorer: " + topScorer + " with average " + highestAvg);
    }
}
