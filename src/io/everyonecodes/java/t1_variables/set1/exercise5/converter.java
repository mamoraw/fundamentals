package io.everyonecodes.java.t1_variables.set1.exercise5;

import java.util.Scanner;

public class converter {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter celsius value: ");
        double celsius = getInput.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Fahrenheit: " + fahrenheit);
    }
}

//typing 12.5 gives an Error, so I'll have to change my Systems region.
