package collectionstasks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class task8 {
    public static void main(String[] args) {
        Map<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(3, "Banana");
        unsortedMap.put(1, "Apple");
        unsortedMap.put(4, "Mango");
        unsortedMap.put(2, "Orange");
        Map<Integer, String> sortedMap = new TreeMap<>(unsortedMap);
        System.out.println("Sorted Map by Keys:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
