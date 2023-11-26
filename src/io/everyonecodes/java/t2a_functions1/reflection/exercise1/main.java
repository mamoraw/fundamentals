package io.everyonecodes.java.t2a_functions1.reflection.exercise1;
/* Exercise 1

Lisa is doing some physics experiments, where she needs to make a lot of measurements
and convert them to different units. She wants to write a program to help her with that.

In your main function, ask the user for a length in centimeters (see below).
Then convert the length to the following units. Write a function for each conversion
that takes the length in centimeters as its parameter, and prints the result (see below).
Call all those functions from the main function to produce the same output as below.
Do the same thing for a mass in kilograms, which gets converted into the units below.

Enter a length in centimeters:
10
meters: 0.1
inches: 3.937007874
yards: 0.10936100000000001
Enter a mass in kilograms:
100
grams: 100000.0
(metric) tons: 0.1
pounds: 220.462


*/

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the length in centimeters ");
        double centimeters = scanner.nextDouble();

        centimetersInMeters(centimeters);
        centimetersInInches(centimeters);
        centimetersInYards(centimeters);

        System.out.println("Enter a mass in kilograms: ");
        double kilograms = scanner.nextDouble();

        kilogramsInGrams(kilograms);
        kilogramsInMetricTons(kilograms);
        kilogramsInPounds(kilograms);

    }
    public static void centimetersInMeters(double centimeters) {
        double meters = centimeters / 100;
        System.out.println("meters: " + meters);
    }
    public static void centimetersInInches(double centimeters) {
        double inches = centimeters * 0.393701;
        System.out.println("inches: " + inches);
    }
    public static void centimetersInYards(double centimeters) {
        double yards = centimeters * 0.0109361;
        System.out.println("yards: " + yards);
    }
    public static void kilogramsInGrams(double kilograms) {
        double grams = kilograms * 1000;
        System.out.println("grams: " + grams);
    }
    public static void kilogramsInMetricTons(double kilograms) {
        double metricTons = kilograms / 1000;
        System.out.println("(metric) tons: " + metricTons);
    }
    public static void kilogramsInPounds(double kilograms) {
        double pounds = kilograms * 2.20462;
        System.out.println("pounds: " + pounds);
    }
}
