package io.everyonecodes.java.t6_classes.set1.exercise6;

import java.util.List;

//Matilda is reading her grandma’s cookbook.
//
//Do the following:
//Define the Recipe class that contains the following properties:
//the name
//the number of minutes it takes to prepare the dish
//a list with necessary ingredients
//a list of instruction steps it takes to prepare the dish
//Create one Recipe instance with values of your choice.
// Store those values in a variable first before using them to create the instance.
public class Main {
    public static void main(String[] args) {
        List<String> ingredients = List.of("eggs", "butter", "flour", "sugar");
        List<String> instructions = List.of("go shopping", "go home", "mix everything together", "bake it", "?", "enjoy");
        int minutesToPrepare = 30;
        Recipe pie = new Recipe("Kuchen", minutesToPrepare, ingredients, instructions);

        System.out.println(pie.ingredients);
        System.out.println(pie.instructions);
    }
}
