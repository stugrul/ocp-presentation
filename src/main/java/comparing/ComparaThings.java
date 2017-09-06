package comparing;

import java.util.Set;
import java.util.TreeSet;

public class ComparaThings {
    public static class Duck {
        private String name;
        private int age;


    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck());

        for (Duck duck: ducks) {
            System.out.println(duck);
        }
    }

        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Duck duck = (Duck) o;

            if (age != duck.age) {
                return false;
            }
            return name != null ? name.equals(duck.name) : duck.name == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + age;
            return result;
        }
    }
}
