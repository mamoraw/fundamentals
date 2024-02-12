package io.everyonecodes.java.t6_classes.set1.exercise5;
//John' phone does not play audio anymore so he calls tech support. The call agent asks John about his phone.
//
//Do the following:
//Define the Phone class that contains the brand and the hasBeenTurnedOffAndOnAgain properties.
//Write code that the call agent runs to ask for both of the pieces of information that are necessary to create a Phone instance.
//Create one Phone instance with the information collected by the call agent.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the brand of the phone?");
        String brand = scanner.nextLine();

        System.out.println("Has it been turned off and on again?");
        boolean hasBeenTurnedOffAndOnAgain = scanner.nextBoolean();

        Phone phone = new Phone(brand, hasBeenTurnedOffAndOnAgain);

        System.out.println(phone.brand + '\n' + phone.hasBeenTurnedOffAndOnAgain);
    }
}
