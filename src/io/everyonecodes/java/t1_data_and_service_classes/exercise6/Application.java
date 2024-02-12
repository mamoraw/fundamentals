package io.everyonecodes.java.t1_data_and_service_classes.exercise6;
//Do the following:
//Create an Application class and in your main method, create an instance of one of the data classes from one of the previous exercises.
//Create a new reference to the same data class, and assign the instance you just created to it. Do not create a new instance of the same class.
//Using the first variable, change the value of one of the properties of the instance you created. You might need to add a setter to the data class to do so.
//Print the value of the property twice, using both references you created. Will this print the same value twice, or will both values (before and after the change) be printed?
//Explain the result in your own words in a comment in the code.

import io.everyonecodes.java.t1_data_and_service_classes.exercise5.Shoe;

public class Application {
    public static void main(String[] args) {
        // Create an instance of a data class.
        Shoe shoe = new Shoe(40, "black");
        // New variable with the same value as the first one.
        Shoe newShoe = shoe;
        // Change the value of one of the properties.
        shoe.setSize(44);
        // Print the size of shoe and newShoe.
        System.out.println(shoe.getSize());
        System.out.println(newShoe.getSize());
        // 44 is printed for both variables. This is because there is only one instance of the class "Shoe".
        // So if the property "size" in one variable is changed, it's also changed for the other variable.
    }
}
