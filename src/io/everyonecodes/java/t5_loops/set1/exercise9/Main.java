package io.everyonecodes.java.t5_loops.set1.exercise9;

import java.util.Scanner;

// Derek and his friends are sitting in a park, bored and decide to play a game.
// They will pay attention to the people who walk around them and get points when they fulfill a certain condition.
// Hansel says there will be more people wearing a hat. Matilda says there will be more people bringing a pet.
// And Derek says that there will be more people listening to music. When one person passes by, they ask their
// questions and they get one point per positive answer.
//
//Define the isWearingAHat function that asks whether a person is wearing a hat and returns a boolean with the answer.
//Define the isBringingAPet function that asks whether a person is bringing a pet and returns a boolean with the answer.
//Define the isListeningToMusic function that asks whether a person is listening to music and returns a boolean with the answer.
//Write code which accumulates the points of each of them for a total of 100 people and says who wins.
//
//Assume that they never get the same amount of points.
//-- Derek, Hansel and Matilda playing the points game
//- Are you wearing a hat?
//- false
//- Are you bringing a pet?
//- true
//- Are you listening to music?
//- false
//
//-- Result of the game
//Matilda got 30 points.
//Hansel got 47 points.
//Derek got 45 points.
//Hansel wins.
public class Main {
    public static void main(String[] args) {
        int peopleToCount = 0;
        int hanselPoints = 0;
        int matildaPoints = 0;
        int derekPoints = 0;

        // count should be set for 100, also every person now gets asked if he is wearing hat, pet and music
        while (peopleToCount < 5) {
            if (isWearingAHat()) {
                hanselPoints++;
            }
            if (isBringingAPet()) {
                matildaPoints++;
            }
            if (isListeningToMusic()) {
                derekPoints++;
            }
            peopleToCount++;
        }
        System.out.println("Matilda has: " + matildaPoints);
        System.out.println("Derek hast: " + derekPoints);
        System.out.println("Hansel has: " + hanselPoints);

        if (matildaPoints > derekPoints && matildaPoints > hanselPoints) {
            System.out.println("Matilda wins.");
        } else if (derekPoints > hanselPoints) {
            System.out.println("Derk wins.");
        } else {
            System.out.println("Hansel wins.");
        }
    }

    public static boolean isWearingAHat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you wearing a hat?");
        return scanner.nextBoolean();
    }

    public static boolean isBringingAPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a pet?");
        return scanner.nextBoolean();
    }

    public static boolean isListeningToMusic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you listening to music?");
        return scanner.nextBoolean();
    }
}
