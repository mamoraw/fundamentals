package io.everyonecodes.java.t1_data_and_service_classes.reflection.exercise1;

import java.util.List;

// Define the Cart class that contains a list of CartItems and the name of the cart owner. Define getters for both properties.
public class Cart {
    private List<CartItem> cartItems;
    private String nameOfOwner;

    public Cart(List<CartItem> cartItems, String nameOfOwner) {
        this.cartItems = cartItems;
        this.nameOfOwner = nameOfOwner;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }
}
