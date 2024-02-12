package io.everyonecodes.java.t1_data_and_service_classes.reflection.exercise2;

import io.everyonecodes.java.t1_data_and_service_classes.reflection.exercise1.Cart;

// After the introduction, the shop assistant walks Derek and Hansel through the shop and asks them what they want to buy. After that, the cashier tells them how much they need to pay.
//
//Do the following:
//Define the ShopAssistant class with the walkThroughShop method that receives the name of a person and returns a Cart. In this method, the ShopAssistant repeatedly asks, which product the person wants to buy, how much it costs and how many times the person wants to buy it, following the interaction below. The ShopAssistant stops asking, if it receives an empty String as product. Don’t redefine the Cart, CartItem and Product classes but use the ones from exercise 1.
//Define Cashier class with the billCustomer method that receives a Cart and prints the total price that the owner has to pay. Look below for examples of desired output.
//Define the Application class that contains the main method. Inside, create a new ShopAssistant and use it to walk first Derek, then Hansel through the shop. After that, create a new Cashier and use it to bill both Derek and Hansel.
//
//--- Part A
//Hello Derek, welcome to our shop!
//What do you want to buy?
//- Bananas
//How much does it cost?
//- 1.5
//How many do you want?
//- 3
//Thank you, we will put that in the cart!
//What do you want to buy?
//- Milkbottles
//How much does it cost?
//- 2.3
//How many do you want?
//- 1
//Thank you, we will put that in the cart!
//What do you want to buy?
//-
//Thank you for shopping with us!
//
//--- Part B
//Derek has to pay 6.8 Euros.
//Hansel has to pay 12.0 Euros.
public class Application {
    public static void main(String[] args) {
        Cart dereksCart = ShopAssistant.walkThroughShop("Derek");
        Cart hanselsCart = ShopAssistant.walkThroughShop("Hansel");

        Cashier.billCustomer(dereksCart);
        Cashier.billCustomer(hanselsCart);
    }
}
