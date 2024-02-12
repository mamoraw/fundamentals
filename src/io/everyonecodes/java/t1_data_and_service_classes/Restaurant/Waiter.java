package io.everyonecodes.java.t1_data_and_service_classes.Restaurant;

import java.util.Scanner;

public class Waiter {
    public static Dish getOrder() {
        System.out.println("What can I get you?");
        return Costumer.tellWhatTheyWant();
    }

    public static void cleanTable() {
        System.out.println("clean table");
    }

    public static double calculateCash(int money, Dish dish) {
        return money - dish.getPrice();
    }


}