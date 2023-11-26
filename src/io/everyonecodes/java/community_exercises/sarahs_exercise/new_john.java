package io.everyonecodes.java.community_exercises.sarahs_exercise;

/* John wants to get to know his friends better and is creating a name learning program. For this, he wants to create two functions:
One that asks the user for his or her first name and afterwards for an item (adjective/food/drink) that starts with the same letter.
Another one that combines the two together. This function requires two strings from the previous function as parameters and should be called from the main function
This is the expected output: “Hi, Sarah Spaghetti! Nice to meet you!”*/

import java.util.Scanner;

public class new_john {

    public static void main(String[] args) {
        askInput();
    }
    public static void greet(String name, String item) {
        System.out.println("Hi, " + name + " " + item + "! Nice to meet you!");
    }

    public static void askInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Tell me your favourite item!");
        String item = scanner.nextLine();

        greet(name, item);
    }
}
