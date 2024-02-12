package io.everyonecodes.java.t2b_functions2.set2.exercise1;

public class Pure_Taxi {
    public static void main(String[] args) {
        System.out.println(printTotalCost(20));
        System.out.println(printTotalCost(40));
        System.out.println(printTotalCost(50));
    }

    public static double calculateTaxiCost(int numberOfMinutes) {
        return numberOfMinutes * 1.15 + 2.5;
    }

    public static String printTotalCost(int minutes) {
        return "The total cost is: " + calculateTaxiCost(minutes);
    }
}
