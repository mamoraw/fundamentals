package io.everyonecodes.java.t2b_functions2.set2.exercise4;

import java.util.Scanner;

public class PureRice {
    public static void main(String[] args) {
        ricePerWeek();
    }

    public static void ricePerWeek() {

        double gramsOfRice = gatherRice("Monday");
        gramsOfRice += gatherRice("Tuesday");
        gramsOfRice += gatherRice("Wednesday");
        gramsOfRice += gatherRice("Thursday");
        gramsOfRice += gatherRice("Friday");
        gramsOfRice += gatherRice("Saturday");
        gramsOfRice += gatherRice("Sunday");

        System.out.println("You will eat a total of " + (int) calculateGrainsInLifetime(gramsOfRice) + " grains in your life.");
    }

    public static double gatherRice(String weekDay) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("How many grams of rice did you eat on %s?\n", weekDay);
        return scanner.nextDouble();
    }

    public static double calculateGrainsInLifetime(double rice) {
        double averageRicePerDay = rice / 7;
        return averageRicePerDay * 365.25 * 85 * 50;
    }
}
