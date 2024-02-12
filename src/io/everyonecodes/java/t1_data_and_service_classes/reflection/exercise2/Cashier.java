package io.everyonecodes.java.t1_data_and_service_classes.reflection.exercise2;

import io.everyonecodes.java.t1_data_and_service_classes.reflection.exercise1.Cart;
import io.everyonecodes.java.t1_data_and_service_classes.reflection.exercise1.CartItem;

// Define Cashier class with the billCustomer method that receives a Cart and prints the total price that the owner
// has to pay. Look below for examples of desired output.
public class Cashier {
    public static void billCustomer(Cart cart) {
        double amountToPay = 0;

        for (CartItem item : cart.getCartItems()) {
            amountToPay += item.getAmount() * item.getProduct().getPricePerUnitInEuro();
        }
        System.out.printf("%s has to pay %f Euros.%n", cart.getNameOfOwner(), amountToPay);
    }
}