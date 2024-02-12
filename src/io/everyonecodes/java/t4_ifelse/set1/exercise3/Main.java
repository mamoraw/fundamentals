package io.everyonecodes.java.t4_ifelse.set1.exercise3;
//Define the cards list with the names of the card pictures that Derek is holding in his hand, as described below.
//Write code that Derek runs to play the final round of the game,
// calculate the score and react depending on those points, following the interaction below.
// The only way for Derek to know whether he’s holding a particular card picture is to check the cards list.
// You don't need to remove any cards from the list (since it's the final round of the game, we don't need to discard it).
//
//Pictures of the cards in Derek’s hand: Screws, Sparks, Circuits
//
//-- Interaction of Derek and a friend during the last round of the game, Derek speaks first
//
//-- (scenario 1)
//Name a picture.
//Lanterns
//Oops! I don’t have it! That’s 13 points. Well played!
//
//-- (scenario 2)
//Name a picture.
//Screws
//That’s 19 points. I almost got you there! Well played!
//
//-- (scenario 3)
//Name a picture.
//Circuits
//That’s 21 points. Yay! I won!

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> cards = new ArrayList<>(List.of("Screws", "Sparks", "Circuits"));
        Scanner scanner = new Scanner(System.in);
        int score = 13;

        System.out.println("Name a picture.");
        String answer = scanner.nextLine();
        // check if the answer is in the list and check for the score, else no points.
        if (cards.contains(answer)) {
            score += answer.length();
            if (score < 20) {
                System.out.println("That's " + score + " points. I almost got you there! Well played!");
            } else {
                System.out.println("That's " + score + " points. Yay! I won!");
            }
        } else {
            System.out.println("OOps. I don't have it. That's " + score + " points. Well played.");
        }
    }
}
