package io.everyonecodes.java.t1_data_and_service_classes.Restaurant;

public class Dish {
    private String nameOfDish;
    private int price;



    public Dish(String nameOfDish, int price) {
        this.nameOfDish = nameOfDish;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }
}
