package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise7;

import java.util.ArrayList;
import java.util.List;

//Define the apparel list containing the clothing and shoes in the right order.
//Write code that picks the right clothing and shoes from the apparel list so that Matilda can play basketball.
// Reference each item with a different variable.
//Write code that prints in one sentence which items she will wear.
//
//Clothing and shoes on the bed in the particular order:
//blouse, sneakers, scarf, sandals, jeans, shorts, tank top, blazer.
//
//Sentence:
//I will wear a tank top, shorts and sneakers.

public class Clothing {
    public static void main(String[] args) {
        List<String> apparel = new ArrayList<>(List.of("blouse", "sneakers", "scarf", "sandals", "jeans", "shorts", "tank top", "blazer"));

        String blouse = apparel.get(0);
        String sneakers = apparel.get(1);
        String scarf = apparel.get(2);
        String sandals = apparel.get(3);
        String jeans = apparel.get(4);
        String shorts = apparel.get(5);
        String tankTop = apparel.get(6);
        String blazer = apparel.get(7);

        System.out.println("I will wear a " + tankTop + ", " + shorts + " and " + sneakers + ".");
    }
}
