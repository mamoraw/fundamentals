package io.everyonecodes.java.t2b_functions2.set2.exercise2;

import java.util.Scanner;

public class Pure_debt {
    public static void main(String[] args) {
        debtCalculator();
    }

    public static void debtCalculator() {
        Scanner getInput = new Scanner(System.in);

        System.out.println("How much money do you owe?");
        int debt = getInput.nextInt();

        System.out.println("How much do you spend each week?");
        int expenses = getInput.nextInt();

        System.out.println("How much income do you have each month?");
        int income = getInput.nextInt();

        System.out.println("You will need " + giveNumbers(debt, expenses, income) + " months to purge your debt.");
    }

    public static double giveNumbers(int debt, int expenses, int income) {
        int monthlyPlus = income - expenses * 4;
        return (double) debt / monthlyPlus;
    }
}
