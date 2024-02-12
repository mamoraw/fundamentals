package io.everyonecodes.java.t6_classes.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

//Derek has lunch in a restaurant and checks out the menu.
//
//Do the following:
//Define the Dish class that contains the name and the price properties.
//Define the Menu class that contains the restaurantName and the dishes properties.
//In your Main class, define the listMenu function that receives one menu and lists each one of its dish names together with their price.
//In the main function, define the dishes list that is empty.
//Create three Dish instances with values of your choice and add them to the dishes list.
//Create one Menu instance with the restaurant name of your choice and the dishes list. List the dishes afterwards.
//
//-- Example of what the robo-waiter could say when listing all dishes on the menu
//These are the available dishes on the menu:
//Lasagna for 7.6 Euro
//Caesar Salad for 5.8 Euro
//Fish & Chips for 3.9 Euro
public class Main {
    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();

        Dish schnitzel = new Dish("Schnitzel", 16.90);
        Dish gulasch = new Dish("Gulasch", 7.90);
        Dish palatschinken = new Dish("Palatschinken", 6.90);

        dishes.add(schnitzel);
        dishes.add(gulasch);
        dishes.add(palatschinken);

        Menu schnitzelhaus = new Menu("Schnitzelhaus", dishes);

        listMenu(schnitzelhaus);
    }

    public static void listMenu(Menu schnitzelhaus) {
        System.out.println("These are the available dishes on the menu:");

        for (Dish dish : schnitzelhaus.dishes) {
            System.out.println(dish.name + " for " + dish.price + " Euro");
        }
    }
}
