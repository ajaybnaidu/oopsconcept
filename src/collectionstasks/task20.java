package collectionstasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task20 {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("JavaScript");
        languages.add("Java");
        int count = Collections.frequency(languages, "Java");
        System.out.println("Frequency of 'Java': " + count);
    }
}

