package io.everyonecodes.java.t1_data_and_service_classes.exercise4;

import java.util.List;

//Define the AverageCalculator class that contains the calculateAverage method which receives a list of integers and
//returns the average (be aware that the average is often a decimal number!).
public class AverageCalculator {
    public double calculateAverage(List<Integer> steps) {
        double sum = 0;

        for (int number : steps) { // Collect the steps from the list.
            sum += number;
        }
        return sum / steps.size(); // Return the average.
    }
}
