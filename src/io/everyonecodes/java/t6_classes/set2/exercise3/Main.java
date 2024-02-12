package io.everyonecodes.java.t6_classes.set2.exercise3;

import java.util.List;

//Matilda is driving her car and notices that traffic signs have different shapes like squares, circles or triangles.
//She wonders how often every particular shape appears on her way from home to work.
//
//Do the following:
//Define the Shape class that contains the name and color properties (both Strings).
//Define the countShape function that receives a list of shapes and one particular example shape and returns the number of
//times that this particular example shape appears in the received shapes.
//Define the countStops function that receives a list of shapes and returns how many of them were the stop sign, considering
//that its shape is a red octagon.
//Write the code that Matilda uses to count the amount of stop signs that she sees while driving from home to work and prints it.
//
//Note that the == logical operator cannot be used between variables referencing instances of classes.
//-- Example of what Matilda says after counting the amount of stop signs
//There are 2 stop signs from my home to work!

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = getTrafficSignsFromHomeToWork();

        System.out.println(countStops(shapes));
    }

    public static String countStops(List<Shape> shapes) {
        int counter = 0;
        for (Shape shape : shapes) {
            if (shape.name.equals("octagon") && shape.color.equals("red")) {
                int i = countShape(shapes, shape);
                counter += i;
            }
        }
        return "There are " + counter + " stop signs from my home to work!";
    }

    // this function seems to be unnecessary?
    public static int countShape(List<Shape> shapes, Shape exampleShape) {
        int counter = 0;
        for (Shape shape : shapes) {
            if (shape == exampleShape) {
                counter++;
            }
        }
        return counter;
    }

    public static List<Shape> getTrafficSignsFromHomeToWork() {
        return List.of(
                new Shape("octagon", "red"),
                new Shape("triangle", "red"),
                new Shape("circle", "white"),
                new Shape("circle", "blue"),
                new Shape("octagon", "red")
        );
    }
}
