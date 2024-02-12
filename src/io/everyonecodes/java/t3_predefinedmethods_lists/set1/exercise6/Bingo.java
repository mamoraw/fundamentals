package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise6;

//Define the bingoBalls list that contains the bingo ball numbers using the given available function below.
//Write code that retrieves the first number from the bingoBalls list, and prints it as shown below.
// Also remove the element from the list, so that it doesn’t show up again.

//Desired output:
//And the next number is... 23!

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bingo {
    public static void main(String[] args) {
        List<Integer> bingoBalls = getBingoNumbersShuffled();
        System.out.println("And the next number is: " + bingoBalls.remove(0));


        //getNumber(bingoBalls); for recursion
    }

    public static List<Integer> getBingoNumbersShuffled() {
        // Creates a list from 1 to 75 and shuffles it
        List<Integer> numbers = Stream.iterate(1, n -> n + 1)
                .limit(75)
                .collect(Collectors.toList());
        Collections.shuffle(numbers);
        return numbers;
    }
    // printing 75 numbers with recursion:
    /*public static void getNumber (List<Integer> bingoBalls) {
        int numberToPrint = bingoBalls.get(0);
        System.out.println("And the next number is... " + numberToPrint + "!");
        bingoBalls.remove(0);
        Scanner scanner = new Scanner(System.in);
        // skips a Line so you press Enter to receive the next Bingo ball.
        scanner.nextLine();
        getNumber(bingoBalls);
    }*/
}
