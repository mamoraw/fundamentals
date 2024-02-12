package io.everyonecodes.java.consolidation_fundamentals.exercise5;

import io.everyonecodes.java.t1_variables.set1.exercise4.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Write a method named removeOutliers.
//Parameter: A list of integers.
//
//Return value: A new List of Integers. This list should have all the numbers from the list that was passed as parameter,
//except for the greatest and smallest number in that list.
//
//Call your function from the main function with different values to test it.
//Implement this yourself using loops, do not use predefined functions like Collections.max.
//
//Special cases:
//If the list has less than three elements, nothing should be removed.
//If the greatest number appears multiple times, it should only be removed once.
//If the smallest number appears multiple times, it should only be removed once.
//
//Hint:
//You can create a copy of a list like this:
//List<Integer> exampleList = new ArrayList<>(List.of(1, 2, 3, 4));
//List<Integer> copiedList = new ArrayList<>(exampleList);
//
//This way you can add/remove elements from the copy without it affecting the original list.
//
//Examples:
//{3, 5, 1, 3, 9} -> {3, 5, 3} Remark: 1 and 9 were removed
//{3, 5, 1, 3, 9, 1} -> {3, 5, 3, 1} Remark: 1 and 9 were removed, but the second 1 remains
//{1, 1, 1} -> {1} Remark: 1 and 1 were removed, another 1 remains
//{1, 3} -> {1, 3} Remark: Nothing was removed, since there are only 2 elements
//{6} -> {6} Remark: Nothing was removed, since there is only 1 element
//{1, 5, 3} -> {3} Remark: 1 and 5 were removed
//
//
//Optional: Do this exercise again, but this time, use arrays everywhere instead of lists.
public class Main {
    public static void main(String[] args) {
//        System.out.println(removeOutliers(new ArrayList<>(List.of(2, 3, 4, 5))));
//        System.out.println(removeOutliers(new ArrayList<>(List.of(1, 1, 1, 1, 1, 1))));
//        System.out.println(removeOutliers(new ArrayList<>(List.of(3, 5, 1, 3, 9, 1, 9))));
//        System.out.println(removeOutliers(new ArrayList<>(List.of(3, 5))));
//        System.out.println(removeOutliers(new ArrayList<>(List.of(3))));
        System.out.println(removeOutliers(new ArrayList<>(List.of(9, 5, 3))));
    }

    public static List<Integer> removeOutliers(List<Integer> numbers) {
        List<Integer> newNumbers = new ArrayList<>(numbers);
        int minValue = numbers.getFirst();
        int maxValue = numbers.getFirst();

        if (numbers.size() >= 3) {
            for (int number : numbers) {
                if (number < minValue) {
                    minValue = number;
                } else if (number > maxValue) {
                    maxValue = number;
                }
            }
            newNumbers.remove(Integer.valueOf(minValue));
            newNumbers.remove(Integer.valueOf(maxValue));
        }
        return newNumbers;
    }
}
