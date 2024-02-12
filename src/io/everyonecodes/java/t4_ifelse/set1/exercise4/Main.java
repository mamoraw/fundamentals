package io.everyonecodes.java.t4_ifelse.set1.exercise4;

import java.util.Scanner;

//Define the isAtHome function that asks whether Hansel is at home and returns a boolean with the answer,following the interactions below.
//Define the isGrandmaUsingCableTelephone function that asks whether his grandma is using the cable telephone already and returns a boolean with the answer,
// following the interactions below.
//Write code that Hansel runs to call a friend with his cell phone. If he is at his grandma’s place and she’s not using the cable telephone,
// he will use the cable telephone instead. Use the two available functions below.
//
//public static void callWithCableTelephone() {
//   System.out.println("Calling with cable telephone");
//}
//public static void callWithCellPhone() {
//   System.out.println("Calling with cell phone");
//}
//
//
//Example Interaction
//-- About to call a friend (scenario 1)
//Are we at home?
//false
//  --- (calls the friend with the cell phone)
//
//-- About to call a friend (scenario 2)
//Are we at home?
//true
//Grandma, are you using the cable telephone?
//true
//   --- (calls the friend with the cell phone)
//
//-- About to call a friend (scenario 3)
//Are we at home?
//true
//Grandma, are you using the cable telephone?
//false
//  --- (calls the friend with the cable telephone)
public class Main {
    public static void main(String[] args) {
        System.out.println("-- About to call a friend");

        if (isAtHome()) {
            if (isGrandmaUsingCableTelephone()) {
                callWithCellPhone();
            } else {
                callWithCableTelephone();
            }
        } else {
            callWithCellPhone();
        }
    }

    public static boolean isAtHome() {
        System.out.println("Are we at home?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }

    public static boolean isGrandmaUsingCableTelephone() {
        System.out.println("Grandma, are you using the cable telephone?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }

    public static void callWithCableTelephone() {
        System.out.println("Calling with cable telephone");
    }

    public static void callWithCellPhone() {
        System.out.println("Calling with cell phone");
    }
}