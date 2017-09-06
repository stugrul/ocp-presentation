package generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCard {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("tweet");

        List<Object> objects = new ArrayList<>(strings);
        addSound(strings);
        addSound(objects);
    }

    private static void addSound(final List<? super String> list) {
        list.add("quack");
    }
}
