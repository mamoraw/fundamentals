package io.everyonecodes.java.t4_ifelse.set1.exercise6;
// If the person is not an adult or writes an invalid name, it apologizes and ends the form.
// A person is an adult if they are at least 18 years old. The name of a person is valid if it has at least 3 letters.
//If everything was entered correctly, and the policies described above are met, it proceeds
//to sign up the person with the name and shows a loading symbol before printing a message.
//If the information is not valid according to the policies described above, the person is not signed up and an apology message is printed instead.

//a) Define the isAdult function that asks for a person’s age, checks whether it is 18 or older and returns a boolean with the result.
//b) Define the isValid function that receives a name, checks that it has at least 3 letters and returns a boolean with the result.
//c) Write code that the computer runs to gather the form information of only one person, following the interaction below. Use the available functions.

import java.util.Scanner;

//Example Interaction (Scenario 1):
//How old are you?
//18
//Please, write your name:
//Katinka
//Name was added to the database
//Loading symbol is being displayed
//You’re signed up! Thank you.
//
//
//Example Interaction (Scenario 2):
//How old are you?
//16
//Please, write your name:
//Katinka
//Your age or name do not follow our policies. We apologize for the inconveniences.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your name: ");
        String name = scanner.nextLine();

        if (isAdult() && isValid(name)) {
            signUp(name);
            displayLoadingSymbol();
            System.out.println("You’re signed up! Thank you.");
        } else {
            System.out.println("Your age or name do not follow our policies. We apologize for the inconveniences.");
        }
    }

    public static boolean isAdult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        return scanner.nextInt() >= 18;
    }

    public static boolean isValid(String name) {
        return name.length() >= 3;
    }

    public static void signUp(String name) {
        System.out.println("Name was added to the database");
    }

    public static void displayLoadingSymbol() {
        System.out.println("Loading symbol is being displayed");
    }
}
