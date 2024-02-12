package io.everyonecodes.java.t2b_functions2.lecture.exercise2;

import java.util.Scanner;

public class Nested_function {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give number: ");
        double x = scanner.nextDouble();


    }
    public static double multi(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static double minus(double a, double b) {
        return a - b;
    }
}
