package collectionstasks;

import java.util.HashSet;
import java.util.Set;

public class task4 {
    public static void main(String[] args) {
        Set<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");   
        languages.add("Python"); 
        System.out.println("Languages in the set: " + languages);
    }
}