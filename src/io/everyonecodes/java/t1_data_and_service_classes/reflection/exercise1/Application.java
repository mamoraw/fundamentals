package io.everyonecodes.java.t1_data_and_service_classes.reflection.exercise1;

import io.everyonecodes.java.t6_classes.set1.exercise4.Car;

// Derek and Hansel are shopping and the shop assistant explains to them how shopping carts work.
//
//Do the following:
//Define the Product class that contains a product’s name and its price (per unit) in Euro (as double). Provide a getter for the name. Provide a getter and a setter for the price.
//Define the CartItem class that contains a product and the amount of times it appears in the cart. Provide a getter for the product. Provide a getter and a setter for the amount.
//Define the Cart class that contains a list of CartItems and the name of the cart owner. Define getters for both properties.
//Define the Application class that contains the main method.
//Inside the main method, create two different Products. Change the price of one product after creating it.
//From previously created Products, create two CartItems. Change the amount of one of them after creating.
public class Application {
    public static void main(String[] args) {
        Product product1 = new Product("This is product one", 10.0);
        Product product2 = new Product("This is product two", 8.0);

        product1.setPricePerUnitInEuro(12.00);

        CartItem cartItem1 = new CartItem(product1, 3);
        CartItem cartItem2 = new CartItem(product2, 5);

        cartItem1.setAmount(10);
    }
}
