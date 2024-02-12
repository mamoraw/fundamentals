package io.everyonecodes.java.t6_classes.set2.exercise1;
//A friend of Matilda’s works part-time as a cashier in a big supermarket. Write code that her friend runs when a
// customer approaches her with a bag full of products to purchase.
//
//Do the following:
//Define the Product class that contains the name and the amount properties.
//Define the products list using the available function.
//Calculate the total price that the customer has to pay for all the products.
//

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = getProductsToPurchase();

        double forPrice = 0;
        for (Product product : products) {
            double price = getPricePerUnit(product) * product.amount;
            forPrice += price;
        }
        System.out.println(forPrice);

        // doing it with a while loop
//        int i = 0;
//        double totalPrice = 0;
//
//        while (i < products.size()) {
//            double pricePerUnite = getPricePerUnit(products.get(i));
//            double price = pricePerUnite * products.get(i).amount;
//            totalPrice += price;
//            i++;
//        }
//        System.out.println("The total price is: " + totalPrice);
    }

    public static List<Product> getProductsToPurchase() {
//    Returns a list of products to buy
        return List.of(
                new Product("apple", 2),
                new Product("orange", 3),
                new Product("beer", 4),
                new Product("tacos", 20)
        );
    }

    public static double getPricePerUnit(Product product) {
        if (product.name.equals("apple")) {
            return 0.5;
        } else if (product.name.equals("orange")) {
            return 0.7;
        } else if (product.name.equals("beer")) {
            return 1.4;
        } else if (product.name.equals("tacos")) {
            return 0.3;
        } else {
            return 0;
        }
    }
}
