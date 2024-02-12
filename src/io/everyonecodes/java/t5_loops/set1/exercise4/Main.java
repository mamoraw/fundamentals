package io.everyonecodes.java.t5_loops.set1.exercise4;
// For her birthday, Matilda invites her two friends, Derek and Hansel to go bowling.
// When they arrive, they notice that the bowling club has a special discount:
// you pay according to the length of your name. The number of letters defines the price in Euro.
//
//Define the names list with the three friends’ names.
//Write the code that the cashier runs in order to calculate and print the total price that
//Matilda has to pay for herself and her friends.

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Matilda", "Derek", "Hansel");
        int amountToPay = 0;
        for (String name : names) {
            amountToPay += name.length();
        }
        System.out.println(amountToPay);
    }
}
