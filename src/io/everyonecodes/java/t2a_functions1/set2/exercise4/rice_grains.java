package io.everyonecodes.java.t2a_functions1.set2.exercise4;

import java.util.Scanner;

public class rice_grains {

    public static void main(String[] args) {

        ricePerWeek();
    }
    public static void ricePerWeek() {

        Scanner getRice = new Scanner(System.in);

        //we could alo turn "How many grams of rice..." into a String
        //String question = "How many grams...";
        //System.out.println(question + "Monday?");

        System.out.println("How many grams of rice did you eat on Monday?");
        int gramsOfRice = getRice.nextInt();

        System.out.println("How many grams of rice did you eat on Tuesday?");
        gramsOfRice = gramsOfRice + getRice.nextInt();
        // we could also write gramsOfRice += getRice.netInt();

        System.out.println("How many grams of rice did you eat on Wednesday?");
        gramsOfRice = gramsOfRice + getRice.nextInt();

        System.out.println("How many grams of rice did you eat on Thursday?");
        gramsOfRice = gramsOfRice + getRice.nextInt();

        System.out.println("How many grams of rice did you eat on Friday?");
        gramsOfRice = gramsOfRice + getRice.nextInt();

        System.out.println("How many grams of rice did you eat on Saturday?");
        gramsOfRice = gramsOfRice + getRice.nextInt();

        System.out.println("How many grams of rice did you eat on Sunday?");
        gramsOfRice = gramsOfRice + getRice.nextInt();

        double averagePerDay = ((double)gramsOfRice) / 7;

        grainsLifetime(averagePerDay);
    }
    public static void grainsLifetime(double rice) {

        rice =  rice * 365.25 * 85 * 50;
        System.out.println("You will eat a total of " + (int)rice + " grains in your life.");
    }
}



