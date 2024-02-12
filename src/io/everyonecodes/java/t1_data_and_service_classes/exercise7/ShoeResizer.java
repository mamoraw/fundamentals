package io.everyonecodes.java.t1_data_and_service_classes.exercise7;

import io.everyonecodes.java.t1_data_and_service_classes.exercise5.Shoe;

//Create a ShoeResizer class, containing two methods: enlarge and shrink. Both methods should take a Shoe as a parameter, and increase/decrease the shoe's size by 1. They should not return anything.
public class ShoeResizer {
    public static void enlarge(Shoe shoe) {
        shoe.setSize(shoe.getSize() + 1); // Set shoe size to its size + 1.
    }

    public static void shrink(Shoe shoe) {
        shoe.setSize(shoe.getSize() - 1); // Set shoe size to its size - 1.
    }
}
