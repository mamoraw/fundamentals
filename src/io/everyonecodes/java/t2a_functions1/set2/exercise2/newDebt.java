package io.everyonecodes.java.t2a_functions1.set2.exercise2;

import java.util.Scanner;

public class newDebt {

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

        giveNumbers(debt, expenses, income);
    }
    public static void giveNumbers(int debt, int expenses, int income) {

        int monthlyPlus = income - (expenses * 4);
        double timeNeeded = (double) debt / monthlyPlus;
        System.out.println("You will need " + timeNeeded + " months to purge your debt.");
    }
}
