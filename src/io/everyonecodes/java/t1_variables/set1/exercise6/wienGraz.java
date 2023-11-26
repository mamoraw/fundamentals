package io.everyonecodes.java.t1_variables.set1.exercise6;
//The distance from Wien to Graz is 200.1 km.
// Calculate the different driving times given the speed
// values below and print the results.

//Average speed by bus: 90 km/h
//Average speed by car: 110 km/h


public class wienGraz {

    public static void main(String[] args) {

        double distance = 200.1;
        double busSpeed = 90;
        double carSpeed = 110;

        double busTime = distance / busSpeed;

        double carTime = distance / carSpeed;

        System.out.println("The bus takes " + busTime + " and the car takes " + carTime);

    }
}
