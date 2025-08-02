package collectionstasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task19 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("Original List: " + colors);
        Collections.reverse(colors);
        System.out.println("Reversed List: " + colors);
    }
}

