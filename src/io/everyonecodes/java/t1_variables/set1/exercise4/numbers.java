package io.everyonecodes.java.t1_variables.set1.exercise4;

import java.util.Scanner;

public class numbers {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.println("Tell me your first number.");
        int firstNumber = getInput.nextInt();

        System.out.println("What is your second number?");
        int secondNumber = getInput.nextInt();

        System.out.println("Tell me your third number.");
        int thirdNumber = getInput.nextInt();

        int sum = firstNumber * secondNumber * thirdNumber;

        System.out.println("The result of the multiplication is " + sum);
    }
}
