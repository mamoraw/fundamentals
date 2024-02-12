package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise1;
// John and Lisa go to a restaurant and want to split the bill evenly. The total bill amount is 13.40€.
// They want to add a 10% tip. After adding the tip and splitting the bill, they also both round up to the nearest whole number.
//
// Do the following:
// In your main function, write code that calculates how much each of them has to pay using the concrete numbers from above,
// store the result in a variable, and print it.
// Write a function that generalizes this problem.
// Write a function that, given the total bill amount, the number of people sharing the bill, and the tip percentage,
// calculates how much each person has to pay, and returns the result. You can assume that the bill is split evenly
// and everyone tips the same percentage.
// Call your function from the main function (with values of your choice that make sense) and print the result.

public class SplitBill {

    public static void main(String[] args) {
        double totalAmount = 46.70;
        int numberOfPeople = 4;
        int tipInPercent = 20;

        System.out.println("Each of you hast do pay: " + calculateSplitBill(totalAmount, numberOfPeople, tipInPercent) + "$.");
    }

    public static double calculateSplitBill(double totalAmount, int numberOfPeople, int tipInPercent) {
        double amountToPay = calculatePercent(tipInPercent, totalAmount);
        double amountPerPerson = amountToPay / numberOfPeople;
        return Math.ceil(amountPerPerson);
    }

    public static double calculatePercent(int tipInPercent, double totalAmount) {
         return (totalAmount / 100) * tipInPercent + totalAmount;
    }
}
