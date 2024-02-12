package io.everyonecodes.java.t4_ifelse.set1.exercise7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Define the lookForIngredient function that receives a list of ingredients of a particular cake,
// asks for a particular ingredient and has two possible returns depending on whether this particular ingredient is included in the cake or not, as shown below.
//Define the ingredientsOfMostFamousCake list with the ingredients of the most famous cake using the available function.
//Write code that the robo-assistant of the bakery runs to serve Derek and let
// him know whether that ingredient is used in their most famous cake, using the
// ingredientsOfMostFamousCake list and the lookForIngredient function, following the interaction below.
//
//Example Interaction:
//-- Attending a customer at the bakery (scenario 1)
//What particular ingredient are you looking for?
//Vanilla
//That ingredient is not included in the cake.
//
//-- Attending a customer at the bakery (scenario 2)
//What particular ingredient are you looking for?
//Chocolate
//That ingredient is indeed included in the cake.

public class Main {
    public static void main(String[] args) {
        List<String> ingredientsOfMostFamousCake = new ArrayList<>(getIngredientsOfMostFamousCake());
        System.out.println("-- Attending a customer at the bakery");

        if (lookForIngredient(ingredientsOfMostFamousCake)) {
            System.out.println("That ingredient is indeed included in the cake.");
        } else {
            System.out.println("That ingredient is not included in the cake.");
        }
    }

    public static List<String> getIngredientsOfMostFamousCake() {
        return List.of("Custard", "Chocolate", "Strawberries", "Cream");
    }

    public static boolean lookForIngredient(List<String> listOfIngredients) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What particular ingredient are you looking for?");
        return listOfIngredients.contains(scanner.nextLine());
    }
}
