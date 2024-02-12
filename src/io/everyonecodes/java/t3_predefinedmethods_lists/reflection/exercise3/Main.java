package io.everyonecodes.java.t3_predefinedmethods_lists.reflection.exercise3;

import java.util.ArrayList;
import java.util.List;

// A startup called Brackets just rented an office in Derek’s building. After having a chat with them,
// they told him that their crazy designer has decided that as a corporate identity rule their documents
// will only be written with words that start and end with capital letters. Apart from the first and last
// letters of each word, the rest will be written in small letters. They have to find a way to simplify writing
// like this, but they don’t know how.
//
//Define the makeFirstCapital function that receives one word and returns the same word, but with the first letter as a capital letter.
// All other characters should stay the same.
//Define the makeLastCapital function that receives one word and returns the same word, but with the last letter as a capital letter.
// All other characters should stay the same.
//Define the formatToBracketsCI function that receives one word and applies the corporate identity rule of Brackets before returning it.
// Make sure to call the other functions you defined above.
//Write code that applies the corporate identity of Brackets to the original words shown below and stores the results
// in one variable each.
//Create a list containing each of the variables you created in part d, and print it.
//
//Original words: reward, cable, Samantha, SpaceX, upperCase
//Modified words: RewarD, CablE, SamanthA, SpaceX, UppercasE

public class Main {

    public static void main(String[] args) {
        String reward = "reward";
        String cable = "cable";
        String samantha = "Samantha";
        String spaceX = "SpaceX";
        String upperCase = "upperCase";

        List<String> correctWords = new ArrayList<>();

        correctWords.add(formatToBracketsCI(reward));
        correctWords.add(formatToBracketsCI(cable));
        correctWords.add(formatToBracketsCI(samantha));
        correctWords.add(formatToBracketsCI(spaceX));
        correctWords.add(formatToBracketsCI(upperCase));

        System.out.println(correctWords);
    }

    public static String formatToBracketsCI(String word) {
        return makeLastCapital(makeFirstCapital(word));
    }

    public static String makeFirstCapital(String word) {
        return word.toUpperCase().charAt(0) + word.substring(1).toLowerCase();
    }

    public static String makeLastCapital(String word) {
        return word.substring(0, word.length() - 1) + word.toUpperCase().substring(word.length() - 1);
    }
}
