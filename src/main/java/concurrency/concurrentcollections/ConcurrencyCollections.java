package concurrency.concurrentcollections;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Serkan on 04/09/2017.
 */
public class ConcurrencyCollections {
    public static void main(String[] args) {
        Map<Integer, String> foodData = new HashMap<>();
        foodData.put(1, "penguin");
        foodData.put(2, "flamingo");

        Set<Integer> s1 = foodData.keySet();
        List<Integer> l2 = new CopyOnWriteArrayList<>(s1);
        Set<Integer> s3 = new ConcurrentSkipListSet<>(s1);

        for (Integer item : s1) {
            s1.remove(item);
        }

        for (Integer item : l2) {
            l2.add(item);
        }

        for (Integer item : s3) {
            l2.add(item);
        }

        System.out.println(s1.size() + " " + l2.size() + " " + s3.size());

    }
}
