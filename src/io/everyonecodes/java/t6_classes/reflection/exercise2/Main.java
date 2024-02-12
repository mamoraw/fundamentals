package io.everyonecodes.java.t6_classes.reflection.exercise2;

import java.util.List;

//While visiting the museum, John gets fascinated by a painting that contains a multitude of shapes, like squares,
//circles and triangles, combined in different colors.
//
//Do the following:
//Define the Shape class that contains the name and color properties (both Strings).
//Define the countShape function that receives several shapes as a list and one particular example shape and returns the
//number of times that this particular example shape appears in the received shapes.
//Define the countFavouriteShapes function that receives several shapes as a list and returns the sum of how many of them
//are red squares and green triangles.  For example, a shape is considered a red square when its name property is "square"
//and its color property is "red".
//Write the code that John uses to count how many times his favourite shapes appear in the painting and print that number.
//

//Note that the == logical operator cannot be used to compare instances of classes
//-- Example of what John could print after counting the amount of favourite shapes
//My favourite shapes appear 6 times!

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = getPaintingShapes();

        System.out.println("My favourite shapes appear " + countFavouriteShapes(shapes) + " times!");
    }

    public static int countFavouriteShapes(List<Shape> shapes) {
        // Also possible would be to make a list that contains the example shapes and loop through the list
        // to pass the shapes to countShape.
        Shape redSquare = new Shape("square", "red");
        Shape greenTriangle = new Shape("triangle", "green");

        return countShape(shapes, redSquare) + countShape(shapes, greenTriangle);
    }

    public static int countShape(List<Shape> shapes, Shape exampleShape) {
        int counter = 0;
        for (Shape shape : shapes) {
            if (shape.name.equals(exampleShape.name) && shape.color.equals(exampleShape.color)) {
                counter++;
            }
        }
        return counter;
    }

    public static List<Shape> getPaintingShapes() {
        return List.of(
                new Shape("circle", "blue"),
                new Shape("circle", "red"),
                new Shape("triangle", "green"),
                new Shape("circle", "blue"),
                new Shape("rectangle", "yellow"),
                new Shape("circle", "blue"),
                new Shape("square", "red"),
                new Shape("rectangle", "blue"),
                new Shape("square", "red"),
                new Shape("triangle", "green"),
                new Shape("circle", "blue"),
                new Shape("rectangle", "yellow"),
                new Shape("triangle", "green"),
                new Shape("square", "red")
        );
    }
}
