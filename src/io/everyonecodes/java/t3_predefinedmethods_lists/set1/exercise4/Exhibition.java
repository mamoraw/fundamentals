package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise4;

//Write code that defines as variables the four different magazine titles shown below.

//Write code that picks the pieces that John needs from those four different variables and
// places them in the designTitle variable that he will use for his exhibition. Print the result.
// Do not use String literals (expressions surrounded by quotes, "like this") to solve this part of
// the exercise. Instead, use predefined methods to build up the new string from the contents of the 4 variables
// you defined in part a.
//
//Magazine title 1: "The beauty and the beast"
//Magazine title 2: "Gardening is a great thing"
//Magazine title 3: "The ‘Diodes for Everyone’ robo-political party loses participation"
//Magazine title 4: "The most impressive concert of all time"
//John’s design title: The robo-beauty is a great thing for party time

public class Exhibition {
    public static void main(String[] args) {
        String mag1 = "The beauty and the beast";
        String mag2 = "Gardening is a great thing";
        String mag3 = "The ‘Diodes for Everyone’ robo-political party loses participation";
        String mag4 = "The most impressive concert of all time";

        System.out.println(designTitel(mag1, mag2, mag3, mag4));
    }

    public static String designTitel(String mag1, String mag2, String mag3, String mag4) {
        String the = mag1.substring(0, 3);
        String robo = mag3.substring(25, 31);
        String beauty = mag1.substring(4, 10);
        String isGreat = mag2.substring(9, 26);
        String ffor = mag3.substring(11, 16);
        String party = mag3.substring(41, 47);
        String time = mag4.substring(35, 39);

        return the + robo + beauty + isGreat + ffor +party + time;
    }
}
