package io.everyonecodes.java.t3_predefinedmethods_lists.reflection.exercise1;

//Write code that contains the English alphabet in one String variable, in lowercase.
//Write code that contains the digits from zero to nine in one String variable.
//Write code that stores the String "VW8456" in a variable, and prints it.
// Don't hardcode this String, but instead use predefined methods and String concatenation (the + operator)
// to piece together the desired String from the two variables you defined above in a) and b).
//
//English alphabet: abcdefghijklmnopqrstuvwxyz
//Digits: 0123456789
//Expected String: VW8456

public class Main {

    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";

        String vwCaps = alphabet.toUpperCase().substring(21, 23);
        String eight = String.valueOf(digits.charAt(8));
        String fourFiveSix = digits.substring(4, 7);

        System.out.println(vwCaps + eight + fourFiveSix);
    }
}
