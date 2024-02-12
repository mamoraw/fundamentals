package io.everyonecodes.java.t2b_functions2.set1.exercise1;

public class punctuality {
    public static void main(String[] args) {

        double walkingDistance = 3.7;
        int tramStations = 5;

        // receives the number of stations, the walking distance to the tram station and the walking distance to the friend’s house.
        // It should return the total time used for commuting using the functions defined in Part a and b
        System.out.println("The total time needed is: " + calculateTotalTime(walkingDistance, tramStations));
    }
    public static double calculateTotalTime(double walkingDistance, double tramStations) {
        double walkingTime = calculateWalkingTime(walkingDistance);
        // receives the walking distance in kilometers and returns the walking time in minutes
        double tramTime = calculateTramTime(tramStations);
        // receives the number of stations you go with the tram and returns the time in minutes
        return walkingTime + tramTime;
    }
    public static double calculateWalkingTime(double kilometers) {
        return kilometers * 15;
    }
    public static double calculateTramTime(double stations) {
        return stations * 4;
    }
}
