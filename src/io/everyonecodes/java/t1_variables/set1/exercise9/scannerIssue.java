package io.everyonecodes.java.t1_variables.set1.exercise9;

import java.util.Scanner;

public class scannerIssue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // after pressing Enter the scanner immediately reads in the empty line, therefore we move the scanner to the next line. We also could make a new scanner.
    }
}