package io.everyonecodes.java.t2a_functions1.set2.exercise5;

import java.util.Scanner;

public class furniture {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter the advertisement text: ");
        String advertisement = getInput.nextLine();

        endOfAd(advertisement);
        beginningOfAd(advertisement);
        doesAll(advertisement);
    }
    public static void endOfAd(String ad) {

        System.out.println(ad + " - Perfect Condition!!!");
    }
    public static void beginningOfAd(String ad) {

        System.out.println("TOP - " + ad);
    }
    public static void doesAll(String ad) {

        System.out.println("TOP - " + ad + " - Perfect Condition!!!");
    }
}
