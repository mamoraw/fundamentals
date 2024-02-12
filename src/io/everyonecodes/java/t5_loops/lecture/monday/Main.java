package io.everyonecodes.java.t5_loops.lecture.monday;

// ask the user for the height of a cubical and print it using #.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How tall should the cube be?");
        int cubeHeight = scanner.nextInt();

        for (int i = 1; i <= cubeHeight; i++) {
            System.out.println(" ");
            for (int n = 1 ; n <= cubeHeight; n++) {
                System.out.print("#");
            }
        }
    }
}
