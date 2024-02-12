package io.everyonecodes.java.t1_data_and_service_classes.exercise5;
import java.util.List;

//Define the ShopAssistant class that contains the findShoeForCustomer method which receives a customer. It makes the customer try on each shoe from the
//list below until one fits. If the shoe doesn’t fit, it says "Nope, this one doesn’t fit, sorry!". If it fits, it says the sentence noted below.

//Available shoes: (39, "pink"), (40, "red"), (38, "blue"), (42, "black")
//Say "I will take the red one!" but replace the color with the color of the fitting shoe!
public class ShopAssistant {
    public static void findShoeForCustomer(ShoeCustomer customer) { // It can be static because there is only one instance of the class (there is only one worker so to say), because it is a service class.
        List<Shoe> shoes = List.of( // Make this into a private List. It should not be in the method.
                new Shoe(39, "pink"),
                new Shoe(40, "red"),
                new Shoe(38, "blue"),
                new Shoe(42, "black")
        );
        // Loop through the shoes and call tryShoe. If it returns true break.
        for (Shoe shoe : shoes) {
            if (customer.tryShoe(shoe)) {
                System.out.printf("I will take the %s one!%n", shoe.getColor());
                break; // return; would also work because of the void and there is no code after the loop.
            } else {
                System.out.println("Nope, this one doesn't fit, sorry!");
            }
        }
    }
}
