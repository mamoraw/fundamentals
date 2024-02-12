package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise5;

//Do the following:
//Define the makeLastCapital function that receives one word and returns the same word,
// but with the last character capitalized. All other characters should stay the same.
//Write code that corrects the following popular robo-drinks.
// Reference each one of the results with a different variable, and print them.
//
//Assume that the length of every drink name is always at least two characters long.

//Popular Irish robo-drinks: pint-eger, GUI-nness, cyber-cider
//Expected names after correcting them: pint-egeR, GUI-nnesS, cyber-cideR

public class LastCapital {
    public static void main(String[] args) {
        System.out.println(makeLastCapital("pint-eger"));
        System.out.println(makeLastCapital("GUI-nness"));
        System.out.println(makeLastCapital("cyber-cider"));

    }
    public static String makeLastCapital(String drinkName) {
        return drinkName.substring(0, drinkName.length() - 1)
                + drinkName.toUpperCase().substring(drinkName.length() - 1);
    }
}


