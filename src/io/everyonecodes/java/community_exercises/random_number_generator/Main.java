package io.everyonecodes.java.community_exercises.random_number_generator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Here is your random number: " + giveRandomNumber(20));// type in the range in which you want your number be in.
            scanner.nextLine();
        }
    }
   //
    public static int giveRandomNumber(int range) {
         return (int) (Math.random() * range + 1);
    }
}
