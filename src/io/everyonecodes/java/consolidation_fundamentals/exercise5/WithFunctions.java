package io.everyonecodes.java.consolidation_fundamentals.exercise5;

import java.util.ArrayList;
import java.util.List;

public class WithFunctions {
    public static int findIndexOfSmallest(List<Integer> numbers) {
        int indexOfSmallest = 0;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < numbers.get(indexOfSmallest)) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int findIndexOfLargest(List<Integer> numbers) {
        int indexOfLargest = 0;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > numbers.get(indexOfLargest)) {
                indexOfLargest = i;
            }
        }
        return indexOfLargest;
    }

    public static void removeLargestElement(List<Integer> list) {
        int indexOfLargest = findIndexOfLargest(list);
        System.out.println(indexOfLargest);
        list.remove(indexOfLargest);
    }

    public static void removeSmallestElement(List<Integer> list) {
        int indexOfSmallest = findIndexOfSmallest(list);
        System.out.println(indexOfSmallest);
        list.remove(indexOfSmallest);
    }

    public static List<Integer> removeOutliers(List<Integer> numbers) {
        List<Integer> copiedList = new ArrayList<>(numbers); // Copies the list (we should return a new list)
        if (numbers.size() < 3) {
            return copiedList;
        }

        removeLargestElement(copiedList);
        removeSmallestElement(copiedList);

        return copiedList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(3, 1, 2, 9, 5));
        List<Integer> newNumbers = removeOutliers(numbers);
        System.out.println(numbers + " -> " +  newNumbers);

        numbers = new ArrayList<>(List.of(4));
        newNumbers = removeOutliers(numbers);
        System.out.println(numbers + " -> " +  newNumbers);

        numbers = new ArrayList<>(List.of(3, 9));
        newNumbers = removeOutliers(numbers);
        System.out.println(numbers + " -> " +  newNumbers);

        numbers = new ArrayList<>(List.of(3, 9, 3));
        newNumbers = removeOutliers(numbers);
        System.out.println(numbers + " -> " +  newNumbers);

        numbers = new ArrayList<>(List.of(3, 9, 1, 1, 1, 9, 9, 8));
        newNumbers = removeOutliers(numbers);
        System.out.println(numbers + " -> " +  newNumbers);

        numbers = new ArrayList<>(List.of(0, 1, 2, 3));
        newNumbers = removeOutliers(numbers);
        System.out.println(numbers + " -> " +  newNumbers);

        numbers = new ArrayList<>(List.of(0, 0, 0));
        newNumbers = removeOutliers(numbers);
        System.out.println(numbers + " -> " +  newNumbers);

    }
}
