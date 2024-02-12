package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise8;

import java.util.ArrayList;
import java.util.List;

//Write code that defines the cups list with two "empty cup"s and a "cup with ball" in that order, just as the example below.
//Starting from the cups list of part a, write the code that the robo-trickster has to do to place the "cup with ball" in the middle of that list.
//Starting from the cups list of part b, write the code that the robo-trickster has to do to place the "cup with ball" at the end of that list.
//Starting from the cups list of part c, write the code that the robo-trickster has to do to place the "cup with ball" at the beginning of that list.
//
//Three cup shuffle trickster game: "empty cup", "empty cup", "cup with ball"

public class CupGame {
    public static void main(String[] args) {
        List<String> cups = new ArrayList<>(List.of("empty cup", "empty cup", "cup with ball"));
        String empty = cups.get(1);
        String full = cups.get(2);

        cups.remove(full);
        cups.add(1, full);

        cups.remove(full);
        cups.add(2, full);

        cups.remove(full);
        cups.add(0, full);


        System.out.println(cups);

        //without variables, but with nesting

        // a) cup with ball in the middle
        /*cups.add(1,cups.remove(2));
        // b) move cup to end
        cups.add(2, cups.remove(1));
        //c) move cup to start
        cups.add(0, cups.remove(2));

        System.out.println(cups);*/
    }
}
