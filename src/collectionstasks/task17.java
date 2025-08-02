package collectionstasks;

import java.util.*;
import java.util.stream.Collectors;

public class task17 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream()
                                              .map(n -> n * n)
                                              .collect(Collectors.toList());
        System.out.println("Squared Numbers: " + squaredNumbers);
    }
}

