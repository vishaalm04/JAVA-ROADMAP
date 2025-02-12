package Iterator;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        // Creating a list
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Getting an Iterator
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
