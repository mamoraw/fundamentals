package io.everyonecodes.java.t1_data_and_service_classes.reflection.exercise2;

import io.everyonecodes.java.t1_data_and_service_classes.reflection.exercise1.Cart;
import io.everyonecodes.java.t1_data_and_service_classes.reflection.exercise1.CartItem;
import io.everyonecodes.java.t1_data_and_service_classes.reflection.exercise1.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Define the ShopAssistant class with the walkThroughShop method that receives the name of a person and returns a Cart.
// In this method, the ShopAssistant repeatedly asks, which product the person wants to buy, how much it costs and how
// many times the person wants to buy it, following the interaction below. The ShopAssistant stops asking, if it receives
// an empty String as product. Don’t redefine the Cart, CartItem and Product classes but use the ones from exercise 1.
public class ShopAssistant {
    public static Cart walkThroughShop(String name) {
        Scanner scanner = new Scanner(System.in);
        List<CartItem> cartItemList = new ArrayList<>();

        while (true) {
            System.out.println("What do you want to buy?");
            String nameOfProduct = scanner.nextLine();

            if (nameOfProduct.isEmpty()) {
                System.out.println("Thank you for shopping with us!\n");
                break;
            } else {
                System.out.println("How much does it cost?");
                double price = scanner.nextDouble();

                System.out.println("How many do you want?");
                int amount = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Thank you, we will put that in the cart!");

                Product product = new Product(nameOfProduct, price);
                CartItem cartItem = new CartItem(product, amount);
                cartItemList.add(cartItem);
            }
        }
        return new Cart(cartItemList, name);
    }
}
