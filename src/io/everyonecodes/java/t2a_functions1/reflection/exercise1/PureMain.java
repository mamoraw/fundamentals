package io.everyonecodes.java.t2a_functions1.reflection.exercise1;

import java.util.Scanner;

public class PureMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the length in centimeters ");
        double centimeters = scanner.nextDouble();

        System.out.println(centimetersInMeters(centimeters));
        System.out.println(centimetersInInches(centimeters));
        System.out.println(centimetersInYards(centimeters));

        System.out.println("Enter a mass in kilograms: ");
        double kilograms = scanner.nextDouble();

        System.out.println(kilogramsInGrams(kilograms));
        System.out.println(kilogramsInMetricTons(kilograms));
        System.out.println(kilogramsInPounds(kilograms));
    }
    public static String centimetersInMeters(double centimeters) {
        return "meters: " + centimeters / 100;
    }
    public static String centimetersInInches(double centimeters) {
        return "inches: " + centimeters * 0.393701;
    }
    public static String centimetersInYards(double centimeters) {
        return "yards: " + centimeters * 0.0109361;
    }
    public static String kilogramsInGrams(double kilograms) {
        return "grams: " + kilograms * 1000;
    }
    public static String kilogramsInMetricTons(double kilograms) {
        return "(metric) tons: " + kilograms / 1000;
    }
    public static String kilogramsInPounds(double kilograms) {
        return "pounds: " + kilograms * 2.20462;
    }
}
