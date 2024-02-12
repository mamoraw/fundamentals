package io.everyonecodes.java.consolidation_fundamentals.exercise1;

import java.util.List;
import java.util.Scanner;

//Read in three numbers from the keyboard and print the greatest:
//
//Enter first number:
//3
//Enter second number:
//5
//Enter third number:
//2
//Greatest: 5
//
//In a new program (create another class with another main function), read in numbers until the user types "stop".
//Print the greatest of all the numbers the user entered. You can assume that the user always enters a valid number or the word
//"stop". Implement this yourself using loops, do not use predefined functions like Collections.max.
//
//Enter a number or type stop:
//3
//Enter a number or type stop:
//5
//Enter a number or type stop:
//2
//Enter a number or type stop:
//stop
//Greatest: 5
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new java.util.ArrayList<>(List.of());

        System.out.println("Enter first number: ");
        numbers.add(scanner.nextInt());
        System.out.println("Enter second number: ");
        numbers.add(scanner.nextInt());
        System.out.println("Enter third number: ");
        numbers.add(scanner.nextInt());

        int greatest = numbers.getFirst();
        if (numbers.get(1) > greatest && numbers.get(1) > numbers.getLast()) {
            greatest = numbers.get(1);
        } else if (numbers.getLast() > numbers.getFirst()) {
            greatest = numbers.getLast();
        }
        System.out.println("Greatest: " + greatest);
    }
}
