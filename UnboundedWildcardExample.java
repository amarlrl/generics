package generics;

import java.util.List;
import java.util.ArrayList;

public class UnboundedWildcardExample {

    // Method that can take any type of List
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        // We can pass any type of list (String, Integer, etc.)
        printList(stringList);  // Output: Hello, World
        printList(intList);     // Output: 1, 2
    }
}

