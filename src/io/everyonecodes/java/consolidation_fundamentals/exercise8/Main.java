package io.everyonecodes.java.consolidation_fundamentals.exercise8;

import java.util.List;

//Create a method named countAboveAverage, which receives a list of numbers. It calculates the average of
//all the numbers in the list. Then it counts the number of elements that are greater than the average and returns it.
//
//Parameter: A list of doubles.
//Return value: The number of elements greater than the average of all elements in the list.
//
//Examples (this is not output, just examples for your understanding):
//
//{3.0, 4.0, 6.0, 1.0, 9.0} -> 2: Remark: 6.0 and 9.0 are greater than the average 4.6
//{3.5} -> 0: Remark: No element is greater than the average 3.5
//{1.5, 7.0, 9.5, 4.0} -> 2: Remark: Two elements are greater than the average 5.5
public class Main {
    public static void main(String[] args) {
        System.out.println(countAboveAverage(List.of(3.0, 4.0, 6.0, 1.0, 9.0)));
        System.out.println(countAboveAverage(List.of(3.5)));
        System.out.println(countAboveAverage(List.of(1.5, 7.0, 9.5, 4.0, 12.5)));
    }

    public static int countAboveAverage(List<Double> numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        double average = sum / numbers.size();

        int numbersAboveAverage = 0;
        for (double number : numbers) {
            if (number > average) {
                numbersAboveAverage++;
            }
        }
        return numbersAboveAverage;
    }
}
