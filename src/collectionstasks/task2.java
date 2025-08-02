package collectionstasks;

import java.util.ArrayList;
import java.util.Collections;

public class task2 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(10);
        numbers.add(87);
        numbers.add(23);
        numbers.add(66);

        Collections.sort(numbers);
        System.out.print("Ascending Order: [");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.print("Descending Order: [");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
