package io.everyonecodes.java.t5_loops.set1.exercise8;

import java.util.List;

// Hansel is reading a very old newspaper that he found in a library. According to a report, in a mystical town long time ago,
// there lived a crazy man that became notorious for randomly shouting at people.
// After a few years of examination, the scientists of that town found out that whether or not the man shouted at people
// depended on the name of the weekday. The man shouted only on weekdays that contained the letter “n”, otherwise he didn’t.
//
//Define the containsCharacter function that receives a string and a char, and returns a boolean indicating whether
//the char was found inside the string. Use loops to implement this function.
//Define the weekdays list that contains all seven weekdays.
//Write the code which, for each weekday, checks if the weekday contains the letter ‘n’ and prints out whether the man
//will shout at people on this day..
//
//- On Monday, the man shouts!
//- On Tuesday, the man doesn’t shout.
//- On Wednesday, the man shouts!
//- On Thursday, the man doesn’t shout.
//- On Friday, the man doesn’t shout.
//- On Saturday, the man doesn’t shout.
//- On Sunday, the man shouts!
public class Main {
    public static void main(String[] args) {
        List<String> weekdays = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        char letterToLookFor = 'S';
       
        for (String weekday : weekdays) {
            if (containsCharacter(weekday, letterToLookFor)) {
                System.out.println("On " + weekday + ", the man shouts!");
            } else {
                System.out.println("On " + weekday + ", the man doesn't shout.");
            }
        }
    }

    public static boolean containsCharacter(String weekday, char n) {
        for (char c : weekday.toCharArray()) {
            char toLower = Character.toLowerCase(n); // now it can look for the letter, no matter if lower or uppercase.
            char toUpper = Character.toUpperCase(n);
            if (c == toLower || c == toUpper) {
                return true;
            }
            // here a version with i++
//        for (int i = 0; i < weekday.length(); i++) {
//            char charAtI = weekday.charAt(i);
//            if (charAtI == n) {
//                return true;
//            }
        } return false;
    }
}
