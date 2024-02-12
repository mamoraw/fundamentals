package io.everyonecodes.java.consolidation_fundamentals.exercise7;

import java.util.Scanner;

//Read in the maximum number of stars and print them as in the example below:
//
//Max:
//5
//*
//**
//***
//****
//*****
//****
//***
//**
//*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Max height: ");

        //printPattern(scanner.nextInt());
        printWithRepeat(5);
    }

    public static void printPattern(int height) {
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <= height - 1; i++) {
            for (int j = 0; j < height - 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // using repeat instead of nested loops
    public static void printWithRepeat(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.println("*".repeat(i));
        }

        for (int j = 1; j <= height; j++) {
            System.out.println("*".repeat(height - j));
        }

    }

    // down here are some previous iterations:

//        int counter = 0;
//        // until the if statement we print a pyramid
//        while (counter < height) {
//            counter++;
//            int secondPartcounter = 0;
//
//            for (int i = 0; i < counter; i++) {
//                System.out.print("*");
//                secondPartcounter++;
//            }
//            // another pyramid standing on its head. starts looping once the counter hits the value of the height
//            if (counter == height) {
//                System.out.println();
//                while (secondPartcounter > 1) {
//                    secondPartcounter--;
//                    for (int i = 0; i < secondPartcounter; i++) {
//                        System.out.print("*");
//                    }
//                    System.out.println();
//                }
//            }
//            System.out.println();
//        }

    // here is a version that prints a pyramid standing on its head. easier to read imo, but not all is in one loop
    // to use comment out everything from the if statement till the first println.
//        while (counter > 1) {
//            counter--;
//            for (int i = 0; i < counter; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

}
