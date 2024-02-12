package io.everyonecodes.java.t6_classes.set1.exercise4;
//John asks his friends about their cars.
//
//Do the following:
//Define the Car class that contains the color and the  yearBuilt properties.
//In the main method, ask the user for the color of the car and the year in which it was built.
//Create one Car instance with the two values from part B.
//Create two Car instances with values of your choice.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the color of the car?");
        String color = scanner.nextLine();
        System.out.println("What year was it built in?");
        int yearBuilt = scanner.nextInt();

        Car firstCar = new Car(color, yearBuilt);
        System.out.println(firstCar.color + '\n' + firstCar.yearBuilt);

        Car secondCar = new Car("Red", 2001);
        Car thirdCar = new Car("Blue", 2022);

        System.out.printf(secondCar.color + '\n' + thirdCar.color);
    }
}
