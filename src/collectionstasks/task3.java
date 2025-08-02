package collectionstasks;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class task3 {

    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C");
        languages.add("Java");
        languages.add("Python");

        Set<String> uniqueLanguages = new LinkedHashSet<>(languages);

        ArrayList<String> result = new ArrayList<>(uniqueLanguages);
        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
