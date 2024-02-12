package io.everyonecodes.java.t2b_functions2.set2.exercise5;

import java.util.Scanner;

public class Pure_furniture {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter the advertisement text: ");
        String advertisement = getInput.nextLine();

        System.out.println(endOfAd(advertisement)
                + '\n' + beginningOfAd(advertisement)
                + '\n' + doesAll(advertisement));
    }

    public static String endOfAd(String ad) {
        return ad + " - Perfect Condition!!!";
    }

    public static String beginningOfAd(String ad) {
        return "TOP - " + ad;
    }

    public static String doesAll(String ad) {
        // Note: order of the functions doesn't mather here!
        return beginningOfAd(endOfAd(ad));
    }
}
