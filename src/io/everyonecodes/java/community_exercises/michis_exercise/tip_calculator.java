package io.everyonecodes.java.community_exercises.michis_exercise;

/*Ask the user "How much was the meal?" and "What percentage would you like to tip?".
Then write a function that calculates the right amount to tip (according to the specified values)
and print out a message like "Leave a ... tip"
 */

import java.util.Scanner;

public class tip_calculator {

    public static void main(String[] args) {

        getInput();
    }
    public static void calculator(double price, double tipPercentage) {

        tipPercentage = tipPercentage / 10000;
        double tipToLeave = price * tipPercentage;

        System.out.println("Leave a " + tipToLeave + "$ tip.");
    }
    public static void getInput(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much was the meal?");
        double priceOfTheMealInCent = 100 * scanner.nextDouble();

        System.out.println("What percentage would you like to tip?");
        int tipPercentage = scanner.nextInt();

        calculator(priceOfTheMealInCent, tipPercentage);
    }
}

