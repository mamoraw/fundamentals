package io.everyonecodes.java.consolidation_fundamentals.exercise4;

import java.util.List;

//Write a method named countTrueValues.
//Parameter: A list of booleans.
//Return value: The number of elements in the List that have the value true.
//
//Call the function a few times with different values in your main function to test it.
//
//Example calls of the function:
//countTrueValues(List.of(false, true, false, true)) -> 2
//countTrueValues(List.of(true, true, false, true)) -> 3
//countTrueValues(List.of(false, false)) -> 0
//countTrueValues(List.of(true)) -> 1
//countTrueValues(List.of()) -> 0
public class Main {
    public static void main(String[] args) {
        System.out.println(countTrueValues(List.of(false, true, false, true)));
        System.out.println(countTrueValues(List.of(true, true, false, true)));
        System.out.println(countTrueValues(List.of(false, false)));
        System.out.println(countTrueValues(List.of(true)));
        System.out.println(countTrueValues(List.of()));
    }

    public static int countTrueValues(List<Boolean> booleans) {
        int counter = 0;

        for (boolean isTrue : booleans) {
            if (isTrue) {
                counter++;
            }
        }
        return counter;
    }
}
