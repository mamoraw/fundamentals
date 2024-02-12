package io.everyonecodes.java.t2b_functions2.set2.exercise3;

import java.util.Scanner;

public class Pure_holiday {
    public static void main(String[] args) {
        buyBusTicket();
        buyBusTicket();
        buyBusTicket();
    }

    public static void buyBusTicket() {
        Scanner getInput = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = getInput.nextLine();

        System.out.println(name + ", which bus seat do you want?");
        int seatNumber = getInput.nextInt();

        System.out.println(bookBusTicket(name, seatNumber));
    }

    public static String bookBusTicket(String name, int seatNumber) {
        return "Ok, attempting to book the ticket..." + '\n' +
                "Bus ticket successfully booked for " + name + "! Your seat number is " + seatNumber + ".";
    }
}
