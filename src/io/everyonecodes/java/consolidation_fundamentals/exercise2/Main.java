package io.everyonecodes.java.consolidation_fundamentals.exercise2;

import java.util.Scanner;

//Read in a number. Then ask the user if they want to add or multiply.
//If they want to add, add all the numbers from 1 to the number the user entered, and print the result.
//If they want to multiply, then multiply all the numbers from 1 to the number they entered.
//See below for examples. Use loop(s) to implement this.
//
//Enter a number:
//10
//What should I do with the numbers from 1 to 10?
//add
//Result: 55
//
//// Other example:
//Enter a number:
//8
//What should I do with the numbers from 1 to 8?
//multiply
//Result: 40320
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("What should I do with the number?");
        scanner.nextLine();
        String operator = scanner.nextLine();

        int sum = 0;
        int prod = 1;
        for (int i = 1; i <= number; i++) {
            sum += i;
            prod *= i;
        }

        if (operator.equals("+")) {
            System.out.printf("Result: %d",sum);
        } else {
            System.out.println("Result: " + prod);
        }
    }
}
