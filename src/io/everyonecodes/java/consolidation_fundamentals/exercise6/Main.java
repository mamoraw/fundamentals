package io.everyonecodes.java.consolidation_fundamentals.exercise6;

import java.util.Scanner;

//Create a simple calculator, with the following operations: add, multiply, subtract, divide, and stop.
//
//Examples:
//Enter operation:
//add
//Enter the left side:
//2
//Enter the ride side:
//3
//Result:
//5.0
//
//Enter operation:
//multiply
//Enter the left side:
//2
//Enter the ride side:
//3
//Result:
//6.0
//
//Enter operation:
//subtract
//Enter the left side:
//2
//Enter the ride side:
//3
//Result:
//-1.0
//
//Enter operation:
//divide
//Enter the left side:
//3
//Enter the ride side:
//3
//Result:
//1.0
//
//Enter operation:
//stop
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        while (true) {
            System.out.println("Enter operation: ");
            String operator = scanner.nextLine();

            if (operator.equals("stop")) {
                break;
            }

            System.out.println("Enter left side: ");
            int leftSide = scanner.nextInt();

            System.out.println("Enter right side: ");
            int rightSide = scanner.nextInt();
            scanner.nextLine();

            // Using switch instead of if statements.
            result = switch (operator) {
                case "+" -> leftSide + rightSide;
                case "-" -> leftSide - rightSide;
                case "*" -> leftSide * rightSide;
                case "/" -> (double) leftSide / rightSide;
                default -> result;
            };
            System.out.println("Result: " + result);
        }
    }
    // Here are some functions for the operations. Not needed but why not.
    public static double addition(int i, int j) {
        return i + j;
    }
    public static double subtract(int i, int j) {
        return i - j;
    }
    public static double multiply(int i, int j) {
        return i * j;
    }
    public static double divide(int i, int j) {
        return (double) i / j;
    }
}
