package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise2;

// Define the makeFirstCapital function that receives one word and returns the same word,
// but with the first letter as a capital letter. The function does not have to handle special cases like empty Strings.

// Write code that corrects the three film titles below using the makeFirstCapital function.
// If there are multiple words in the title, you can separate them manually (we don't know how to do that yet with code).
// You'll have to call the function multiple times then. Reference each film title with a different variable, and print them.
//
// Assume that the length of every film title is always at least two letters long.
// Some wrongly written titles: the matrix, inception, the grand budapest hotel
// Expected titles after correcting them: The Matrix, Inception, The Grand Budapest Hotel

public class DerekFilm {
    public static void main(String[] args) {
        String matrix = "matrix";
        String the = "the";
        String inception = "inception";
        String grand = "grand";
        String budapest = "budapest";
        String hotel = "hotel";

        System.out.println(makeFirstCapital(the) + " " + makeFirstCapital(matrix));
        System.out.println(makeFirstCapital(inception));
        System.out.println(makeFirstCapital(the) + " " + makeFirstCapital(grand) + " " + makeFirstCapital(budapest) + " " + makeFirstCapital(hotel));

    }
    public static String makeFirstCapital(String wordToCap) {
        return wordToCap.substring(0, 1).toUpperCase() + wordToCap.substring(1);
    }
}
