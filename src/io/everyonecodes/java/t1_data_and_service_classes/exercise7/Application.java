package io.everyonecodes.java.t1_data_and_service_classes.exercise7;
//Add setters to the Shoe class from exercise 5.
//Create a ShoeResizer class, containing two methods: enlarge and shrink. Both methods should take a Shoe as a parameter, and increase/decrease the shoe's size by 1. They should not return anything.
//Create an Application class and in your main method, create a Shoe and ShoeResizer instance. Use it to enlarge or shrink the shoe. Print the shoe's size afterwards.
//Explain in your own words why this works.

import io.everyonecodes.java.t1_data_and_service_classes.exercise5.Shoe;

public class Application {
    public static void main(String[] args) {
        Shoe shoe = new Shoe(40, "black");

        ShoeResizer.enlarge(shoe); // Size + 1.
        System.out.println(shoe.getSize());

        ShoeResizer.shrink(shoe); // Size - 1.
        System.out.println(shoe.getSize());
        // I think this works because the get and set methods in the "Shoe" class are public.
    }
}
