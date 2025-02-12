package Iterator;

import java.util.*;

public class IteratorRemoveExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() == 30) {
                iterator.remove(); // Removing element 30
            }
        }

        System.out.println(numbers);
    }
}
