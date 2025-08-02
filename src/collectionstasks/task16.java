package collectionstasks;

import java.util.*;
import java.util.stream.Collectors;

public class task16 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "C++", "Julia", "Ruby");
        List<String> filtered = languages.stream()
                                         .filter(s -> s.startsWith("J"))
                                         .collect(Collectors.toList());
        System.out.println("Strings starting with 'J': " + filtered);
    }
}

