package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise10;

import java.util.ArrayList;
import java.util.List;

//Define the dirtyDishes list that contains three dirty dishes, with the names shown below.
//Define the cleanDishes list that is empty.
//Define the getTop function that receives a list of dishes and returns the last element.
//Define the removeTop function that receives a list of dishes and removes the last element.
//Define the putTop function that receives a list of dishes, and one dish. The function should add the element to the end of the list.

//In your main function, write code that gets the top dish from the pile of dirty dishes, cleans it (using the available function from below)
//and puts it at the top of the clean dishes. Repeat this operation until there are no more dirty dishes.
//Get rid of any code repetition by creating more functions if necessary.

public class Dishes {
    public static void main(String[] args) {
        List<String> dirtyDishes = new ArrayList<>(List.of("plate1", "plate2", "plate3"));
        List<String> cleanDishes = new ArrayList<>(List.of());

        cleanDishes(dirtyDishes, cleanDishes);
        cleanDishes(dirtyDishes, cleanDishes);
        cleanDishes(dirtyDishes, cleanDishes);

        System.out.println(dirtyDishes);
        System.out.println(cleanDishes);
    }

    //Define the getTop function that receives a list of dishes and returns the last element.
    public static String getTop(List<String> dirtyDishes) {
        String cleanDish = dirtyDishes.get(dirtyDishes.size() - 1);
        clean(cleanDish);
        return cleanDish;
    }

    //Define the removeTop function that receives a list of dishes and removes the last element.
    public static void removeTop(List<String> dirtyDishes) {
        dirtyDishes.remove(dirtyDishes.size() - 1);
    }

    public static void clean(String dish) {
        System.out.println("Cleaned dish: " + dish);
    }

    //Define the putTop function that receives a list of dishes, and one dish.
    // The function should add the element to the end of the list.
    public static void putTop(List<String> cleanDishes, String cleanDish) {
        cleanDishes.add(cleanDish);
    }

    public static void cleanDishes(List<String> dirtyDishes, List<String> cleanDishes) {
        String cleanDish = getTop(dirtyDishes);
        removeTop(dirtyDishes);
        putTop(cleanDishes, cleanDish);
    }
}
