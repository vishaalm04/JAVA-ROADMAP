package Iterator;

import java.util.*;

public class ListIteratorExampl {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));

        ListIterator<String> listIterator = names.listIterator();

        System.out.println("Forward Iteration:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Backward Iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}

