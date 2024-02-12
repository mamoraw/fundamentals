package io.everyonecodes.java.t1_data_and_service_classes.reflection.exercise1;
// Define the Product class that contains a product’s name and its price (per unit) in Euro (as double).
// Provide a getter for the name. Provide a getter and a setter for the price.
public class Product {
    private String name;
    private double pricePerUnitInEuro;

    public Product(String name, double pricePerUnitInEuro) {
        this.name = name;
        this.pricePerUnitInEuro = pricePerUnitInEuro;
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnitInEuro() {
        return pricePerUnitInEuro;
    }

    public void setPricePerUnitInEuro(double pricePerUnitInEuro) {
        this.pricePerUnitInEuro = pricePerUnitInEuro;
    }
}
