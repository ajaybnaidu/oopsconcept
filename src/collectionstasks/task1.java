package collectionstasks;

import java.util.ArrayList;

public class task1 {

    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C");
        languages.add("C++");
        languages.add("Ruby");
        languages.add("Python");
        languages.remove(1);

        System.out.print("[");
        for (int i = 0; i < languages.size(); i++) {
            System.out.print(languages.get(i));
            if (i < languages.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
