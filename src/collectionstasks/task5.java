package collectionstasks;

import java.util.Set;
import java.util.TreeSet;

public class task5 {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        System.out.println("Numbers in sorted order: " + numbers);
    }
}

