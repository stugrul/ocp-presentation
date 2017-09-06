package generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard {

    public static void printList(List<Object> list) {
        for (Object x : list) {
            System.out.println(x);
        }

    }
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();

        keywords.add("java");
//        printList(keywords);
    }
}
