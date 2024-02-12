package io.everyonecodes.java.t4_ifelse.set1.exercise8;

import java.util.ArrayList;
import java.util.List;

// Derek’s favorite ice-cream flavors are vanilla and stracciatella, Matilda’s favorite ice-cream flavors are strawberry, chocolate and lemon.
//
//Do the following:
//Define the hasDereksFlavors function that receives a list of all the available ice-cream flavors of a particular restaurant and checks
// if each one of Derek’s favorite flavors are included, returning the result as a boolean.
//Define the hasMatildasFlavors function that receives a list of all the available ice-cream flavors of a particular restaurant and checks
// if each one of Matilda’s favorite flavors are included, returning the result as a boolean.
//Define the isRestaurantOk function that receives the name of a restaurant and returns as a boolean whether it is currently open and
// if both Derek and Matilda want to go there using the available functions below.
//Define the goToBitFreezeRestaurant function that Matilda and Derek use to decide which restaurant to go to according to their preferences,
// picking the Byte-Greissler first if they can, then the Ti-Chy as a second choice, and no option at all otherwise.
// The function has several return statements, each one of them being a message explaining where they want to go, as shown below.
//In your main function, use the functions you defined to recreate the output from below.
//
//Expected output:
//Expected returned messages for goToBitFreezeRestaurant:
//- "We go to Byte-Greissler!"
//- "We go to Ti-Chy!"
//- "All Bit-freeze restaurants are bad!"
//
//
//Output for the main function:
//Does Byte-Greissler have all of Derek's flavors? false
//Does Ti-Chy have all of Matilda's flavors? false
//Is Byte-Greissler open? true
//Is Ti-Chy Open? true
//All Bit-freeze restaurants are bad!
public class Main {
    public static void main(String[] args) {
        List<String> restaurants = new ArrayList<>(List.of("Byte-Greissler", "Ti-Chy", "Veganista"));

        System.out.println("Does Byte-Greissler have all of Derek's flavors? " + hasDereksFlavors(getAvailableFlavors("Byte-Greissler")));
        System.out.println("Does Ti-Chy have all of Matilda's flavors? " + hasMatildasFlavors(getAvailableFlavors("Ti-Chy")));
        System.out.println("Is Byte-Greissler open? " + isRestaurantOpen("Byte-Greissler"));
        System.out.println("Is Ti-Chy Open? " + isRestaurantOpen("Ti-Chy"));
        System.out.println(goToBitFreezeRestaurant(restaurants));
    }

    public static String goToBitFreezeRestaurant(List<String> restaurants) {
        String restaurant = restaurants.removeFirst();

        if (isRestaurantOk("Byte-Greissler")) {
            return "We go to Byte-Greissler!";
        }
        if (isRestaurantOk("Ti-Chy")) {
            return "We go to Ti-Chy!";
        }
        return "All Bit-freeze restaurants are bad!";

//        if (restaurant.equals("Byte-Greissler")) {
//            if (isRestaurantOk(restaurant)) {
//                return "We go to the Byte-Greissler!";
//            } return "false";
//        } else if (restaurant.equals("Ti-Chy")) {
//            if (isRestaurantOk(restaurant)) {
//                return "We go to Ti-chy";
//            } return "false";
//        } return "All Bit-freeze restaurants are bad!";
    }

    public static boolean isRestaurantOk(String restaurantName) {
        List<String> availableFlavors = getAvailableFlavors(restaurantName);
         return isRestaurantOpen(restaurantName)
                 && hasMatildasFlavors(availableFlavors)
                 && hasDereksFlavors(availableFlavors);
    }

    public static boolean hasMatildasFlavors(List<String> availableFlavor) {
        return availableFlavor.contains("strawberry") && availableFlavor.contains("lemon") && availableFlavor.contains("chocolate");
    }

    public static boolean hasDereksFlavors(List<String> availableFlavor) {
        return availableFlavor.contains("stracciatella") && availableFlavor.contains("vanilla");
    }

    public static boolean isRestaurantOpen(String restaurantName) {
        // All restaurants seem to be open at the moment
        return true;
    }

    public static List<String> getAvailableFlavors(String restaurantName) {
        // Returns the list of flavors the two restaurants have.
        // If the restaurant name is unknown, return an empty list
        if (restaurantName.equals("Byte-Greissler")) {
            return List.of("strawberry", "chocolate", "vanilla");
        } else if (restaurantName.equals("Ti-Chy")) {
            return List.of("stracciatella", "chocolate", "lemon", "hazelnut");
        } else {
            return List.of();
        }
    }
}

