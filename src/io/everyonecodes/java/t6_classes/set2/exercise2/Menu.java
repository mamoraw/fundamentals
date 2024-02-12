package io.everyonecodes.java.t6_classes.set2.exercise2;

import java.util.List;

public class Menu {
    String restaurantName;
    List<Dish> dishes;

    public Menu(String restaurantName, List<Dish> dishes) {
        this.restaurantName = restaurantName;
        this.dishes = dishes;
    }
}
