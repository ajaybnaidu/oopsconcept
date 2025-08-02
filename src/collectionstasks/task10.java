package collectionstasks;

import java.util.ArrayList;
import java.util.ListIterator;

public class task10 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        ListIterator<String> iterator = fruits.listIterator();
        System.out.println("Forward Traversal:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nBackward Traversal:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}

