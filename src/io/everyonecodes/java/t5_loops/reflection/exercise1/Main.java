package io.everyonecodes.java.t5_loops.reflection.exercise1;

import java.util.List;
import java.util.Scanner;
//Hansel is throwing a birthday party and prepared a super tasty cake for his guests that he always wanted to try out.
// Since he is very eager for people to taste his cake, he offers it to every guest immediately after greeting them.
//
//In your main function, define the guestList variable using the available getGuestList function.
//Define the greetGuests function that receives a list of names and greets everyone on the list.
//Define the askGuestsForCake function that receives the guest list and asks every guest if they want a piece of cake,
// returning how many pieces of cake are needed as a number.
//In your main function, write the code that Hansel uses to greet his guests, figure out how many pieces of cake
// he needs to prepare (including one for himself), ask his guests to wait and prepare the right number of pieces of cake.
//
//Example output:
//- Hi Matilda, nice to see you!
//- Hi Mugatu, nice to see you!
//- Hi Derek, nice to see you!
//- Hi Samantha, nice to see you!
//- Matilda, do you want a piece of cake?
//- true
//- Mugatu, do you want a piece of cake?
//- true
//- Derek, do you want a piece of cake?
//- false
//- Samantha, do you want a piece of cake?
//- true
//- I'll be right back with 4 pieces of cake!
//- Hansel is preparing 4 pieces of cake.

public class Main {
    public static void main(String[] args) {
        List<String> guestList = getGuestList();

        greetGuests(guestList);

        int piecesOfCakeToServe = askGuestsForCake(guestList) + 1;

        System.out.println("I'll be right back with " + piecesOfCakeToServe + " pieces of cake!");
        System.out.println("Hansel is preparing " + piecesOfCakeToServe + " pieces of cake.");
    }

    public static int askGuestsForCake(List<String> guestList) {
        Scanner scanner = new Scanner(System.in);
        int piecesOfCake = 0;

        for (String guest : guestList) {
            System.out.println(guest + ", do you want a piece of cake?");
            if (scanner.nextBoolean()) {
                piecesOfCake++;
            }
        }
        return piecesOfCake;
    }

    public static void greetGuests(List<String> guestList) {
        for (String guest : guestList) {
            System.out.println("Hi " + guest + ", nice to see you!");
        }
    }

    public static List<String> getGuestList() {
        return List.of("Matilda", "Mugatu", "Derek", "Samantha");
    }

    public static void preparePiecesOfCake(int numberOfPieces) {
        System.out.println("Hansel is preparing " + numberOfPieces + " pieces of cake.");
    }
}
