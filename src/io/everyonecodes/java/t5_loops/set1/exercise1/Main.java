package io.everyonecodes.java.t5_loops.set1.exercise1;

// Define the groceries list that contains the following items: bread, butter, milk, cheese and yoghurt.
//Write code that Derek runs to tell Hansel all the groceries that he needs one by one, following the example below.
//
//- I need bread.
//- I need butter.
//- I need milk.
//- I need cheese.
//- I need yoghurt.

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> groceries = List.of("bread", "butter", "milk", "cheese", "yoghurt");
        for (String item : groceries) {
            System.out.println("I need " + item);
        }
    }
}
