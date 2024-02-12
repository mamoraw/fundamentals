package io.everyonecodes.java.t2b_functions2.reflection.exercise2;
//Define the join function, which has three String parameters.
// The function should return the first two parameters concatenated (joined together),
// with the third one in the middle. For example, if the function is called like this:
//
//	join("Milk", "Butter", ";");
//
//	then it should return:
//
//	"Milk;Butter"
//
//Define two more functions: joinWithSemicolon and joinWithComma.
// They should do the same thing as the join function you created above, except that they only have two parameters.
// The function joinWithSemicolon always uses a semicolon ";" in the middle,
// and the function joinWithComma always uses a comma ",".
// Call the join function from part a from within the bodies of both these functions.
// Call each of the three functions once inside the main function (with values of your choice).
// Store each result in a variable, and print them.

public class Main {

    public static void main(String[] args) {
        String milkAndButter = join("Milk", "Butter", ".");
        String withSemicolon = joinWithSemicolon(";", "Eggs", "Butter");
        String withComma = joinWithComma(",", "Sugar", "Flour");

        System.out.println(milkAndButter);
        System.out.println(withSemicolon);
        System.out.println(withComma);
    }

    public static String join(String firstWord, String secondWord, String punctuation) {
        return firstWord + punctuation + secondWord;
    }

    public static String joinWithSemicolon(String semicolon, String eggs, String butter) {
        return join(eggs, butter, semicolon);
    }

    public static String joinWithComma (String comma, String sugar, String flour) {
        return join(sugar, flour, comma);
    }
}
