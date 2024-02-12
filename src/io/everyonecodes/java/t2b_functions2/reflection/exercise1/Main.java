package io.everyonecodes.java.t2b_functions2.reflection.exercise1;
// Define two functions. The first should calculate and return the area of a square, given the length of its side.
// The second should calculate and return the area of a rectangle, given the length of its sides.
// It's up to you to choose appropriate function names and parameter names.
// In the main function, implement the following interaction, reading in the values from the keyboard:
//
//What's the side length of your square?
//20
//Your square has an area of: 400.0
//What's the width of your rectangle?
//10
//What's the height of your rectangle?
//20
//Your rectangle has an area of: 200.0

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the side length of your square?");
        double squareLength = scanner.nextDouble();
        System.out.println("Your square has an area of: " + calculateSquare(squareLength));

        System.out.println("What's the width of your rectangle?");
        double widthRectangle = scanner.nextDouble();

        System.out.println("What's the height of your rectangle?");
        double heightRectangle = scanner.nextDouble();
        System.out.println("Your rectangle has an area of: " + calculateRectangle(widthRectangle, heightRectangle));



    }
    public static double calculateSquare (double length) {
        return length * length;
    }

    public static double calculateRectangle(double width, double height) {
        return width * height;
    }
}
