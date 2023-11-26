package io.everyonecodes.java.t2a_functions1.set1.exercise4;

import java.util.Scanner;

public class taxi {

    public static void main(String[] args) {

        calculateTaxiCost();
        calculateTaxiCost();
        calculateTaxiCost();
    }
    public static void calculateTaxiCost() {

        Scanner getMinutes = new Scanner(System.in);

        System.out.println("How long was the ride in minutes?");
        int minutes = getMinutes.nextInt();

        double totalCost = minutes * 1.15 + 2.5;
        System.out.println("The total cost is: " + totalCost);
    }

}

