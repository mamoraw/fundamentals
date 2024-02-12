package io.everyonecodes.java.t3_predefinedmethods_lists.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;

//Define the numbers empty list, which will contain integers.
//Add the numbers 1-5 to the list, in that order.
//Remove the numbers 3 and 4 from the list
//Write a function addToMiddleOfList that receives a list of integers and an int, and returns nothing.
// The function should add the integer it receives to the list, so that it is in the middle position.
// Make sure that your function works for all possible lists, not just the one from the main function.
// If the number of elements in the list is uneven before adding, the new element should be added after
// the old middle element. So for example, if the input list is [1, 2, 4] and the element to add is 3,
// the resulting list should be [1, 2, 3, 4]. Here are a few more examples for the input list,
// the element to be added, and the desired result:
//input list: [1, 2];       element to add: 50; result: [1, 50, 2]
//input list: [1];          element to add: 50; result: [1, 50]
//input list: [];           element to add: 50; result: [50]
//input list: [1, 2, 3];    element to add: 50; result: [1, 2, 50, 3]
//input list: [1, 2, 3, 4]; element to add: 50; result: [1, 2, 50, 3, 4]
//
//
//Use your function to re-add the numbers 3 and 4 to the list, so that they're in the correct spot
// (so that the list is [1, 2, 3, 4, 5] again).

public class Main {

    public static void main(String[] args) {
        List<Integer> numbersEmpty = new ArrayList<>(List.of());
        numbersEmpty.add(1);
        numbersEmpty.add(2);
        numbersEmpty.add(3);
        numbersEmpty.add(4);
        numbersEmpty.add(5);
        numbersEmpty.remove(2);
        numbersEmpty.remove(2);

        addToMiddleOfList(numbersEmpty,4);
        addToMiddleOfList(numbersEmpty, 3);

        System.out.println(numbersEmpty);
    }

    public static void addToMiddleOfList(List<Integer> numbers, int number) {
        numbers.add((int) Math.ceil((double) numbers.size() / 2), number);
    }
}
