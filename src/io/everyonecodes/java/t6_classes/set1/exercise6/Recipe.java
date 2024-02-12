package io.everyonecodes.java.t6_classes.set1.exercise6;

import java.util.List;

//Define the Recipe class that contains the following properties:
//the name
//the number of minutes it takes to prepare the dish
//a list with necessary ingredients
//a list of instruction steps it takes to prepare the dish
public class Recipe {
    String name;
    int minutesToPrepare;
    List<String> ingredients;
    List<String> instructions;

    public Recipe(String name, int minutesToPrepare, List<String> ingredients, List<String> instructions) {
        this.name = name;
        this.minutesToPrepare = minutesToPrepare;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }
}
