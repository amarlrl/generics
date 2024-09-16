package generics;

import java.util.List;
import java.util.ArrayList;

public class LowerBoundedWildcardExample {

   
    public static void addIntegers(List<? super Integer> list) {
        list.add(100);
        list.add(200);
    }

    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        List<Float> numList1 = new ArrayList<>();
        
        // We can add integers to a list of Number
        addIntegers(numList);
       // addIntegers(numList1); not possible
        System.out.println(numList); 
        
        
        //here we cannot add double float, double object
    }
}

