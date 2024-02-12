package io.everyonecodes.java.evaluation.exercise2;

import java.util.Scanner;

//Write a method that receives a String as parameter and returns the same String, but reversed. Use loops to implement this method.
//In your main method, ask the user to enter some text, and then print the reversed text. Keep asking until they enter stop.
//Follow the interaction below.
//If the text the user entered is a palindrome (a word that is the same if you read it forwards/backwards),
//print "That's a palindrome!". This check should work even if the word is not all lowercase/uppercase.
//For example, Level and Radar should still be recognized as palindromes.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter some text: ");
            String text = scanner.nextLine();

            if (text.equals("stop")) {
                break;
            } else {
                System.out.println("Reversed: " + reversedString(text));
            }
            if (reversedString(text).equalsIgnoreCase(text)) {
                System.out.println("This is a palindrome!");
            }
        }
    }

    public static String reversedString(String word) {
        String reversedString = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedString += word.charAt(i);
        }
        return reversedString;
    }
}
