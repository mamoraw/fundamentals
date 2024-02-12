package io.everyonecodes.java.t5_loops.reflection.exercise2;

import java.util.List;
import java.util.Scanner;
//Matilda and Derek are playing a game to see who can think of a word that has the highest number of different vowels.
//
//Do the following:
//Define the containsCharacter function that receives a string and a char, and returns a boolean indicating whether
//the char was found inside the string. Use loops to implement this function (do not use the predefined contains method).
//Define the countDistinctVowels function that receives a word and returns the number of different vowels that are inside the word.
// Only lowercase vowels are considered. For example, the String "joke" would have 2 distinct lowercase vowels.
// The String "ooooo" only has one distinct vowel. The code inside this function should define the vowels list with the
// five lowercase vowels of the English alphabet. It should also use the containsCharacter function you defined above.
//In your main function, write code that Matilda runs to play five rounds with Derek. Each time she will ask for a word,
// count the number of distinct vowels and print it.
//
//-- Derek and Matilda playing the vowels game (one round)
//- What is your word?
//- House
//- House contains 3 different vowels!

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // it is better for performance to put the scanner outside off the loop

        int roundsToPlay = 5;
        int counter = 0;

        while (counter < roundsToPlay) {

            System.out.println("What is you word?");
            String wordToCheck = scanner.nextLine();

            System.out.println(wordToCheck + " contains " + countDistinctVowels(wordToCheck) + " different vowels!");
            counter++;
        }
    }

    public static int countDistinctVowels(String word) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        int countVowels = 0;

        for (char vowel : vowels) {
            if (containsCharacter(word, vowel)) {
                countVowels++;
            }
        }
        return countVowels;
    }

    public static boolean containsCharacter(String word, char letter) {
        for (char c : word.toCharArray()) { // int i = 0; i < word.length; i++
            if (c == letter) {              // if (c == word.charAt(i))
                return true;
            }
        }
        return false;
    }
}
