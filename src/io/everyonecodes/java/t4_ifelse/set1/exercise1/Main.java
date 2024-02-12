package io.everyonecodes.java.t4_ifelse.set1.exercise1;

//Write code that Hansel runs to ask the designer about their favourite color.
// Hansel will say a moderate comment if it’s any color except for blue and an exalted comment
// if the color happens to be blue, since that’s his favorite one.

//Write code that Hansel runs to ask the designer whether they would choose to paint the living room
// walls in blue sky color. Hansel will say a moderate comment if the answer is false, and an exalted one if the answer is true.

//Write code that Hansel runs to ask the designer how big of a budget they would spend to decorate a studio.
//Less than 5.000 Euro would make him express his disappointment. More than 15.000 Euro would make him express his exaltation.
// Anything in between would make him express a moderate opinion.

//Write code that Hansel runs to ask the designer how many days they would need to decorate the studio.
// If the studio gets decorated in less than one week, and the budget is more than 12.000 Euro,
// it would make him express his exalted comment. Anything else would make him express a moderate comment.
//
//Disappointed comment: Oh, I didn’t expect something like that...
//Moderate comment: That’s quite interesting.
//Exalted comment: I think just the same!

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String moderateAnswer = "That's quite interesting.";
        String exaltedAnswer = "I think just the same!";
        String disappointment = "Oh, I didn't expect something like that...";

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favorite color?");
        String color = scanner.nextLine();
        if (color.equals("blue")) {
            System.out.println(exaltedAnswer);
        } else {
            System.out.println(moderateAnswer);
        }

        System.out.println("Would you paint the walls in blue sky?");
        String colorOfWall = scanner.nextLine();
        boolean isBlue = colorOfWall.equals("sky blue");
        if (isBlue) {
            System.out.println(exaltedAnswer);
        } else {
            System.out.println(moderateAnswer);
        }

        System.out.println("How much would you spend?");
        int budget = scanner.nextInt();
        if (budget < 5000) {
            System.out.println(disappointment);
        } else if (budget > 15000) {
            System.out.println(exaltedAnswer);
        } else {
            System.out.println(moderateAnswer);
        }

        System.out.println("How many days would you need?");
        int daysNeeded = scanner.nextInt();
        if (daysNeeded < 7 && budget > 12000) {
            System.out.println(exaltedAnswer);
        } else {
            System.out.println(moderateAnswer);
        }
    }
}


