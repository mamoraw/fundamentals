package io.everyonecodes.java.t2b_functions2.lecture.exercise1;

import java.util.Scanner;

public class one_to_hundred {
    public static void main(String[] args) {
        outputNumber(0);

    }
    public static void outputNumber(int i) {
        System.out.println("Your next number is: " + i);
        System.out.println("Press Enter to request a number");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        outputNumber(i + 1);
    }


}
