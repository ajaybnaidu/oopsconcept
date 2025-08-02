package wrapperclass;

import java.util.Arrays;

public class task10 {

    public static void main(String[] args) {
        Integer[] numbers = {45, 32, 67, 89, 23, 67};
        Arrays.sort(numbers);
        System.out.print("Sorted values: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int highest = numbers[numbers.length - 1];
        Integer secondHighest = null;

        for (int i = numbers.length - 2; i >= 0; i--) {
            if (!numbers[i].equals(highest)) {
                secondHighest = numbers[i];
                break;
            }
        }
        if (secondHighest != null) {
            System.out.println("2nd highest value: " + secondHighest);
        } else {
            System.out.println("No distinct 2nd highest value found.");
        }
    }
}

