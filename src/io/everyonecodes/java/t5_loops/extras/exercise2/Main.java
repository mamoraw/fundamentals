package io.everyonecodes.java.t5_loops.extras.exercise2;

import java.util.ArrayList;
import java.util.List;

//Hansel has received a robo-dog and he wants to give it a name, but he wants this name to be special.
// He wants it to consist of a first name and a last name. He has already come up with three possible
// first names and three possible last names. Now he wants to combine each first name with every
// last name to see what combination makes the best name for his robo-dog. Because Hansel
// heard that his robo-dog descends from a very expensive robo-dog breed,
// he wants the name to start with either “Sir” or “Lord”.
//
//Define the firstNames list with the following names: Pupper, Toby and Teddy
//Define the lastNames list with the following names: Boy, Jackson and Champ
//Define the titles list with the following items: Sir and Lord
//Define the generateName function that takes a title, a first name and a last name and returns the
//three values connected together with spaces in between.
//Write code that, for each combination of title, first name and last name, prints the name to Hansel.
//
//-- Result of all possible combinations
//How about Sir Pupper Boy?
//How about Sir Pupper Jackson?
//How about Sir Pupper Champ?
//How about Sir Toby Boy?
//How about Sir Toby Jackson?
//How about Sir Toby Champ?
//How about Sir Teddy Boy?
//How about Sir Teddy Jackson?
//How about Sir Teddy Champ?
//How about Lord Pupper Boy?
//How about Lord Pupper Jackson?
//How about Lord Pupper Champ?
//How about Lord Toby Boy?
//How about Lord Toby Jackson?
//How about Lord Toby Champ?
//How about Lord Teddy Boy?
//How about Lord Teddy Jackson?
//How about Lord Teddy Champ?
public class Main {
    public static void main(String[] args) {
        List<String> firstNames = List.of("Pupper", "Toby", "Teddy");
        List<String> lastNames = List.of("Boy", "Jackson", "Champ");
        List<String> titles = List.of("Sir", "Lord");

        for (String title : titles) {
            for (String firstName : firstNames) {
                for (String lastName : lastNames) {
                    System.out.println(generateName(title, firstName, lastName));
                }
            }
        }
            // here is a version with the big for loop in a function, returning a list. return a string isn't working

//        for (String name : generateName(titles, firstNames, lastNames)) {
//            System.out.printf("How about %s?\n", name);
//        }
//    }
//
//    public static List<String> generateName(List<String> titles, List<String> firstNames, List<String> lastNames) {
//        List<String> dogNames = new ArrayList<>();
//        for (String title : titles) {
//            for (String firstName : firstNames) {
//                for (String lastName : lastNames) {
//                    String dogName = title + " " + firstName + " " + lastName;
//                    dogNames.add(dogName);
//                }
//            }
//        }
//        return dogNames;

    }
    public static String generateName(String title, String firstName, String lastName) {
        return title + " " + firstName + " " + lastName;
    }
}
