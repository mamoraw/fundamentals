package io.everyonecodes.java.t2a_functions1.set2.exercise3;

import java.util.Scanner;

public class derekHoliday {

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

        bookBusTicket(name, seatNumber);
    }
    public static void bookBusTicket(String name, int seatNumber) {

        System.out.println("Ok, attempting to book the ticket...");
        System.out.println("Bus ticket successfully booked for " + name +"! Your seat number is " + seatNumber + ".");
    }
}
