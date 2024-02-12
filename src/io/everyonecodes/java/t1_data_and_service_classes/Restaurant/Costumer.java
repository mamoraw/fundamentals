package io.everyonecodes.java.t1_data_and_service_classes.Restaurant;

import java.util.Scanner;

public class Costumer {
    public static Dish tellWhatTheyWant() {
        System.out.println("Pizza");
        return new Dish("Pizza", 10);
    }

    public static int pay(Dish dish) {
        return dish.getPrice() + 5;
    }
    public static boolean wantsToPay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You want to pay?");
        return scanner.nextBoolean();
    }
}
