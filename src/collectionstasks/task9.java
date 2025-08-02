package collectionstasks;

import java.util.ArrayList;
import java.util.Iterator;

public class task9 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Charlie");
        names.add("Annie");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println("Names after removal: " + names);
    }
}
