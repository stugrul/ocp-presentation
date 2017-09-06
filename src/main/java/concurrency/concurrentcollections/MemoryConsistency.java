package concurrency.concurrentcollections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Serkan on 04/09/2017.
 */
public class MemoryConsistency {
    private static void removeKeyFromMap() {
        Map<String, Object> foodData = new HashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);

        Set<Map.Entry<String, Object>> entries = foodData.entrySet();

        for (Map.Entry en : entries) {
            foodData.remove(en.getKey());
        }
    }

    public static void main(String[] args) {
        MemoryConsistency.removeKeyFromMap();
    }
}
