package io.everyonecodes.java.t4_ifelse.set1.exercise2;
//Big Gear Burger - 6.50 Euro
//Mc Buttons Long Burger - 7.20 Euro
//Veggie Circuits Burger - 5.70 Euro
//French Fries - 2.50 Euro2b
//
import java.util.List;
import java.util.Scanner;
//Write code that the robo-waiter runs to write down Matilda’s order and also tells her how much her meal will cost,
//following the interaction below.
//
//Assume that customers always provide a proper burger name.
//Good day! What burger do you want?
//Big Gear Burger
//Do you want french fries with that?
//true
//That’ll be 9.0 Euro, please
public class Main {
    public static void main(String[] args) {
        String bigGearBurger ="Big Gear Burger";
        String mcButtons ="Mc Buttons";
        double fries = 2.5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Good day! What burger do you want?");
        String burger = scanner.nextLine();
        System.out.println("Do you want french fries with that?");
        boolean isFries = scanner.nextBoolean();

        if (isFries) {
            System.out.println("That will be " + (fries + makePrice(burger, bigGearBurger, mcButtons)) + " Euro, please." );
        } else {
            System.out.println("That will be " +  makePrice(burger, bigGearBurger, mcButtons) + " Euro, please.");
        }
    }

    public static double makePrice (String burger, String bigGear, String mcButtons) {
        if (burger.equals(bigGear)) {
            return 6.50;
        } else if (burger.equals(mcButtons)) {
            return 7.20;
        } return 5.70;
    }

}
