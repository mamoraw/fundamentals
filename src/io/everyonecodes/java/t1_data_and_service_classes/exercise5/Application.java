package io.everyonecodes.java.t1_data_and_service_classes.exercise5;
// Matilda and Hansel need to buy new shoes. Matilda’s shoe size is 38. Hansel has shoe size 42.
//
//Do the following:

//Define the Shoe class that contains a shoe size and a color.

//Define the ShoeCustomer class that contains the shoe size property which it receives through the constructor.
//It also contains the tryShoe method which receives the shoe to try on. If the shoe size is the same as the shoe size property it returns true, otherwise false.

//Define the ShopAssistant class that contains the findShoeForCustomer method which receives a customer. It makes the customer try on each shoe from the
//list below until one fits. If the shoe doesn’t fit, it says "Nope, this one doesn’t fit, sorry!". If it fits, it says the sentence noted below.

//Define the Application class that contains the main method which creates two shoe customers with shoe sizes 38 and 42 and finds shoes for them.
//
//-- Part C
//Available shoes: (39, "pink"), (40, "red"), (38, "blue"), (42, "black")
//Say "I will take the red one!" but replace the color with the color of the fitting shoe!
public class Application {
    public static void main(String[] args) {
        ShoeCustomer matilda = new ShoeCustomer(38); // Create two customers.
        ShoeCustomer hansel = new ShoeCustomer(42);
        // Use the method findShoeForCustomer() of class ShopAssistant to check the shoe sizes. The method is static.
        ShopAssistant.findShoeForCustomer(matilda);
        ShopAssistant.findShoeForCustomer(hansel);
    }
}
