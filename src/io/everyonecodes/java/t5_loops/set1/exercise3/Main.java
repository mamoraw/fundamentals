package io.everyonecodes.java.t5_loops.set1.exercise3;

import java.util.ArrayList;
import java.util.List;
// Using the available getMoneyNumbersFromHanselsFriends function from below, define the list money
// that contains all the amounts his friends have contributed.
//Write code that Hansel runs in order to sum up all the money amounts and print the final result.
//

public class Main {
    public static void main(String[] args) {
        List<Integer> money = getMoneyNumbersFromHanselsFriends();
        //money.addAll(getMoneyNumbersFromHanselsFriends());
        int totalAmount = 0;

        for (int moneyPerPerson : money) {
            totalAmount += moneyPerPerson;
        }
        System.out.println(totalAmount);
    }

    public static List<Integer> getMoneyNumbersFromHanselsFriends() {
//    Let's pretend Hansel has 5 friends where each one is more generous than the next...
        return List.of(1, 2, 3, 4, 5);
    }
}



