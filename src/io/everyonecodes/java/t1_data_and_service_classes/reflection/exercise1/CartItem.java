package io.everyonecodes.java.t1_data_and_service_classes.reflection.exercise1;
// Define the CartItem class that contains a product and the amount of
// times it appears in the cart. Provide a getter for the product. Provide a getter and a setter for the amount.
public class CartItem {
    private Product product;
    private int amount;

    public CartItem(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
