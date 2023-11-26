package io.everyonecodes.java.t1_variables.set1.exercise3;
//John has three plants in his garden and plans to buy ten more. He still has 1 kilogram of fertilizer left over from
// last year, which is enough to take care of 4 plants.
//Do the following:
// Write code that calculates, with variables, the amount of fertilizer that John needs to buy.
// Reference the result of the amountOfFertilizerToBuyInKg with a variable and print it as part of a full sentence
// (see the format below). It's ok if the result is not an integer number.
//Each kg of fertilizer costs 20 Euro, but the shop has a 20% discount offer.
// Write code that calculates the amount of money that the new fertilizer will cost.
// Reference the result of the finalCost with a variable. You can reuse the amountOfFertilizerToBuyInKg variable of the
// previous part. Print the result as a full sentence (see the format below).

import io.everyonecodes.java.t1_variables.set1.exercise1.main;

public class john {

    public static void main(String[] args) {

        double plants = 13;
        double fertilizerLeft = 1;
        double fertilizerPerPlant = fertilizerLeft / 4;
        double amountOfFertilizerToBuyInKg = fertilizerPerPlant * plants - fertilizerLeft;

        System.out.println(amountOfFertilizerToBuyInKg);

        double finalCost = amountOfFertilizerToBuyInKg * 16;

        System.out.println("John needs to buy an additional " + amountOfFertilizerToBuyInKg + "kg of fertilizer to fertilize 13 plants. The total cost for 2.25kg of fertilizer is " + finalCost + "€.");
    }
}