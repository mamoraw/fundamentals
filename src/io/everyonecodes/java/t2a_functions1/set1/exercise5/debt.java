package io.everyonecodes.java.t2a_functions1.set1.exercise5;

import java.util.Scanner;

public class debt {

    public static void main(String[] args) {

        debtCalculator();
    }
    public static void debtCalculator() {

        Scanner getInput = new Scanner(System.in);

        System.out.println("How much money do you owe?");
        int debt = getInput.nextInt();

        System.out.println("How much do you spend each week?");
        int spendings = getInput.nextInt();

        System.out.println("How much income do you have each month?");
        int income = getInput.nextInt();

        int monthlyPlus = income - (spendings * 4);
        double timeNeeded = (double) debt / monthlyPlus;

        System.out.println("You will need " + timeNeeded + " months to purge your debt.");
    }
}
// This is my first solution. I did not read good enough.
// I thought about what happens, if the debt is much higher than the income.
//    double debtCoeff = 4 * ((double) debt / income);
//    double spendingsPerMonth = spendings * debtCoeff;
//    double monthlyPlus = income - spendingsPerMonth;
//    double timeNeeded = (double) debt / monthlyPlus;


/* now I can comment over multiple lines
of code.
this makes it more readable

 */
