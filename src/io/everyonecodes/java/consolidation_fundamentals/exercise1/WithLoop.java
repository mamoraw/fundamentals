package io.everyonecodes.java.consolidation_fundamentals.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
public class WithLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //List<Integer> numbers = new ArrayList<>();
        int greatest = 0;

        while (true) {
            System.out.println("Enter a number or type stop: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }

            if (Integer.parseInt(input) > greatest) {
               greatest = Integer.parseInt(input);
            }
            // doing it with a list and a for loop
//            System.out.println("Enter a number or type stop: ");
//            String userInput = scanner.nextLine();
//            if (userInput.equals("stop")) {
//                break;
//            } else {
//                // converting the string into an integer and put it in the list. Could also be done with .ValueOf()
//                numbers.add(Integer.parseInt(userInput));
//            }
        }
        System.out.println("Greatest: " + greatest);

        // need if done with a for loop
//        int maxValue = numbers.getFirst();
//        for (int number : numbers) {
//            if (number > maxValue) {
//                maxValue = number;
//            }
//        }
//        System.out.println("Greatest: " + maxValue);
    }
}
