package collectionstasks;

import java.util.HashMap;
import java.util.Map;

public class task7 {
    public static void main(String[] args) {
        String input = "hello";
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Character Frequencies: " + freqMap);
    }
}
