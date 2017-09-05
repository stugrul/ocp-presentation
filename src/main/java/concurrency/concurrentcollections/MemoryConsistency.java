package concurrency.concurrentcollections;

import java.util.*;

/**
 * Created by Serkan on 04/09/2017.
 */
public class MemoryConsistency {
    private static void removeKeyFromMap() {
        Map<String, Object> foodData = new HashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);

        for (String key : foodData.keySet()) {
            foodData.remove(key);
        }
    }

    public static void main(String[] args) {
        MemoryConsistency.removeKeyFromMap();
    }
}
