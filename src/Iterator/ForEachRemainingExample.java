package Iterator;

import java.util.*;

public class ForEachRemainingExample {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("New York", "London", "Paris");

        Iterator<String> iterator = cities.iterator();
        iterator.forEachRemaining(city -> System.out.println(city));
    }
}
