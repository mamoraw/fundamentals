package io.everyonecodes.java.t4_ifelse.reflection.exercise1;

import java.util.List;
import java.util.Scanner;

//The price range should be between 150 Euro and 600 Euro, both inclusive.
//The brand should be one of the following:  cLular, Hawaii or SunSong.
//
//You can assume that the phone prices are always integer numbers.
//
//Write a method named shouldBuyPhone that takes the price and brand as parameters, and returns a boolean.
// It should return true if the phone is in the desired price range and one of the desired brands, and false otherwise.
//Write code that asks the user for a specific price and brand, then use the function you defined in part a to check
// if Matilda should buy the phone. See below for example interactions and desired output. Only write this code once.
//
//-- Interaction with the robo-assistant (scenario 1)
//- How expensive is this cell phone?
//- 650
//- Which brand is it?
//- SunSong
//- Can you show me another one?
//
//-- Interaction with the robo-assistant (scenario 2)
//- How expensive is this cell phone?
//- 350
//- Which brand is it?
//- SunSong
//- I will buy this one, thanks!

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How expensive is this cell phone?");
        int price = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Which brand is it?");
        String brand = scanner.nextLine();

        if (shouldBuyPhone(price, brand)) {
            System.out.println("I will buy this one, thanks!");
        } else {
            System.out.println("Can you show me another one?");
        }
    }

    public static boolean shouldBuyPhone(int price, String brand) {
        List<String> desiredBrands = List.of("cLular", "Hawaii", "SunSong");
        return (price >= 150 && price <= 600) && desiredBrands.contains(brand);
    }
}
