package io.everyonecodes.java.t4_ifelse.reflection.exercise3;

import java.util.Scanner;

// They have to be at least 18 years old, be wearing a hat and know a secret password.
//
//Define the isAdult function that asks for a person’s age, checks whether it is 18 or older and returns a boolean with the result.
//Define the isWearingAHat function that asks whether a person is wearing a hat and returns a boolean with the answer.
//Define the knowsSecretPassword function that asks a person for the secret password that must be “Hokopoko” and returns a boolean with the answer to whether the person answered correctly.
//Write the code that the security robot runs to fulfill the club rules with one single person. See the following interaction below for examples and desired output.
//
//-- At the door of the private club
//- How old are you?
//- 20
//- Are you wearing a hat?
//- true
//- What is the secret password?
//- Hokopoko
//- You can enter our club.
//
//-- Another person arrives
//- How old are you?
//- 21
//- Are you wearing a hat?
//- false
//- What is the secret password?
//- Hokus pokus
//- I'm sorry, but you cannot enter our club.

public class Main {
    public static void main(String[] args) {
        boolean isAdult = isAdult();
        boolean isWearingAHat = isWearingAHat();
        boolean knowsSecretPassword = knowsSecretPassword();

        if (isAdult && isWearingAHat && knowsSecretPassword) {
            System.out.println("You can enter the club.");
        } else {
            System.out.println("I'm sorry, but you cannot enter our club.");
        }
    }

    public static boolean isAdult() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        return scanner.nextInt() >= 18;
    }

    public static boolean isWearingAHat() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you wearing a hat?");
        return scanner.nextBoolean();
    }

    public static boolean knowsSecretPassword() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the secret password?");
        return scanner.nextLine().equals("Hokopoko");
    }
}
