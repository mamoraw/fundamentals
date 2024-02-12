package io.everyonecodes.java.t1_data_and_service_classes.exercise4;
//Matilda, Hansel and Derek were using a pedometer during the hike and they know how many steps they gave over the
//full hike. And they are curious about their average amount of steps and their average total distance.
//
//Do the following:
//Define the AverageCalculator class that contains the calculateAverage method which receives a list of integers and
//returns the average (be aware that the average is often a decimal number!).

//Define the StepCollector class that contains the collect method, which asks three times (first Matilda, then Hansel and finally Derek)
//for their number of steps and returns a list with those three integers.

//Define the DistanceCalculator class that contains the calculateDistanceInKilometers method which receives the number of
//steps as a decimal value and returns the distance in kilometers.

import java.util.List;

//Define the Application class that contains the main method. Inside, use the other classes to display the average of
//their steps and their average total distance.
public class Application {
    public static void main(String[] args) {
        StepCollector stepCollector = new StepCollector();
        List<Integer> steps = stepCollector.collectSteps(); // Ask the three Hikers for their step count to make this list.

        AverageCalculator averageCalculator = new AverageCalculator();
        double averageSteps = averageCalculator.calculateAverage(steps); // Calculate average steps.
        System.out.println("The average steps are: " + averageSteps); // Print the average steps.

        DistanceCalculator distanceCalculator = new DistanceCalculator();
        System.out.println("The average total distance in kilometers is: "
                + distanceCalculator.calculateDistanceInKilometers(averageSteps)); // Calculate the distance in kilometers using the averageSteps.
    }
}
