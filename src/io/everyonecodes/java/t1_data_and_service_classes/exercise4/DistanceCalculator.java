package io.everyonecodes.java.t1_data_and_service_classes.exercise4;
//Define the DistanceCalculator class that contains the calculateDistanceInKilometers method which receives the number of
//steps as a decimal value and returns the distance in kilometers.
public class DistanceCalculator {
    public double calculateDistanceInKilometers(double averageSteps) {
        // one step is considered 0.000762 Kilometers.
        return averageSteps * 0.000762; // Return steps in kilometers.
    }
}
