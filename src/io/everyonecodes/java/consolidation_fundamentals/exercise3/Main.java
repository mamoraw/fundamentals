package io.everyonecodes.java.consolidation_fundamentals.exercise3;

import java.util.Scanner;

//Print a triangle of numbers (from right to left) formatted as in the example below.
// Read in the maximum width of the triangle from the keyboard. If the user enters a number that is not
// within the range from 1 to 9, clamp the number to this range. For example, if the user enters 0, you can treat it
// as if they entered 1, if they enter 10, you can treat it as if they entered 9.
//Max:
//6
//     1
//    12
//   123
//  1234
// 12345
//123456
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Max width: ");
//        int width = scanner.nextInt();
//
//        if (width == 0) {
//            width = 1;
//        } else if (width == 10) {
//            width = 9;
//        }

        //makePyramid(width);
        makeMorePyramid(5);
    }
    // solving the problem with nested loops:
    // the variables in the loop should be named like "row" and "space" and "digit"

    public static void makePyramid(int width) {
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= width - i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void makeMorePyramid(int number) {
        // creating a variable that collects everything and then prints it.

//        String print = "";
//
//        for (int i = 1; i <= number; i++) {
//            String empty = "*";
//            empty = empty.repeat(number - i);
//            for (int j = 1; j <= i; j++) {
//                empty += String.valueOf(j);
//            }
//            print += empty + '\n';
//        }
//        System.out.println(print);

        // without a String variable
        for (int i = 1; i <= number; i++) {
            System.out.print("*".repeat(number - i));
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}