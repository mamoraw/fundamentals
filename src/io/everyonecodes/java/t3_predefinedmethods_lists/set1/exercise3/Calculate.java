package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise3;

import java.util.Scanner;

//You're at a store, and the cashier asks the customer for the total price of their items.
// Also ask how much they will pay, and calculate the change.
//
//You can do all this in the main function. You can assume that the customer never pays less than the price.
//
//Hint: You can print the Euro and Cent values as integer numbers (without the decimal point) by converting them into an int first.
// To do this, use a Java feature called 'type casting'. Search the web for "java type casting" or similar to learn how it works, and apply it.
//
//Welcome to our store. How much do you have to pay?
//21.95
//How much are you going to pay?
//30
//Here you are, 8 Euro and 5 cents.

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our store. How much do you have to pay?");
        double amountToPay = scanner.nextDouble();
        System.out.println("How much are you going to pay?");
        amountToPay -= scanner.nextDouble();
         double centToPay = amountToPay - (int)amountToPay;
         double wholeCents = centToPay * 100;

        System.out.println("Here you are, " + Math.abs((int)amountToPay) + " Euro and " + Math.abs((int)wholeCents) + " Cents.");
    }
}
