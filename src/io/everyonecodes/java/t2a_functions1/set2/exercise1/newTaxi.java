package io.everyonecodes.java.t2a_functions1.set2.exercise1;

import java.util.Scanner;

public class newTaxi {

    public static void main(String[] args) {

        calculateTaxiCost(20);
        calculateTaxiCost(40);
        calculateTaxiCost(50);
    }
    public static void calculateTaxiCost(int numberOfMinutes) {

        double totalCost = numberOfMinutes * 1.15 + 2.5;
        System.out.println("The total cost is: " + totalCost);
    }
}
