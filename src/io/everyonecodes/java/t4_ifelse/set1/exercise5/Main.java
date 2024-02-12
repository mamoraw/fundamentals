package io.everyonecodes.java.t4_ifelse.set1.exercise5;
//Define the isWearingAHat function that asks whether a person is wearing a hat and returns a boolean with the answer.
//Define the isBringingAPet function that asks whether a person is bringing a pet and returns a boolean with the answer.
//Write code that the cinema robo-assistant at the door runs to determine whether one customer is let inside or not, following the interaction below.
//
//-- Cinema robo-assistant at the door (scenario 1)
//Are you wearing a hat?
//false
//Are you bringing a pet?
//false
//Welcome to our cinema, how may I assist you?
//
//-- Cinema robo-assistant at the door (scenario 2)
//Are you wearing a hat?
//true
//I’m sorry, but you’re not allowed to enter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (isWearingAHat() || isBringingAPet()) {
            System.out.println("I'm sorry, but you are not allowed to enter.");
        } else {
            System.out.println("Welcome to our cinema, how may I assist you?");
        }
    }

    public static boolean isWearingAHat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you wearing a hat?");
        return scanner.nextBoolean();
    }

    public static boolean isBringingAPet () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you bringing a pet?");
        return scanner.nextBoolean();
    }
}
