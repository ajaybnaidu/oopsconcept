package collectionstasks;

import java.util.*;
class Learner {
    String id;
    String name;
    int marks;

    Learner(String id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " (" + id + ") - " + marks;
    }
}
public class task14 {
    public static void main(String[] args) {
        List<Learner> learners = new ArrayList<>();
        learners.add(new Learner("L101", "Alice", 85));
        learners.add(new Learner("L102", "Bob", 78));
        learners.add(new Learner("L103", "Charlie", 90));
        Map<String, Learner> learnerMap = new HashMap<>();

        for (Learner l : learners) {
            learnerMap.put(l.id, l);
        }
        System.out.println("Learner Map (ID -> Learner):");
        for (Map.Entry<String, Learner> entry : learnerMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
