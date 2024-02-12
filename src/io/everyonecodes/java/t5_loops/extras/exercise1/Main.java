package io.everyonecodes.java.t5_loops.extras.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//The organizers of the big event where Mugatu presented his design are trying to gather information about the
// visitors to make important future business decisions.
//
//Define the isBringingAPet function that asks whether a person is bringing a pet and returns a boolean with the answer.
//Define the isWearingAHat function that asks whether a person is wearing a hat and returns a boolean with the answer.
//Define the isAdult function that asks whether a person is 18 or older and returns a boolean with the answer.
//Define the hasChildren function that asks whether a person has children and returns a boolean with the answer.
//Define the visitors list with the getVisitorList function.
//Write code that the event organizers run to count how many visitors are adults, how many are bringing a pet,
//how many are wearing a hat and how many have children, printing out the statistics like the example below.
//
//-- Event organizer’s statistics:
//
//A total of 732 visitors attended the event.
//From those, 310 (42%) were wearing a hat.
//From those, 258 (35%) were bringing a pet.
//From those, 521 (71%) were adults.
//From those, 362 (49%) were parents.
public class Main {
    public static void main(String[] args) {
        List<String> visitors = getVisitorsList();
        int visitorCount = 0;
        int hatCount = 0;
        int petCount = 0;
        int adultCount = 0;
        int parentCount = 0;

        for (String visitor : visitors) {
            if (isBringingAPet()) {
                petCount++;
            }
            if (isWearingAHat()) {
                hatCount++;
            }
            if (hasChildren()) {
                parentCount++;
            }
            if (isAdult()) {
                adultCount++;
            }
            visitorCount++; // visitors.size would have been the same
        }
        System.out.println("A total of " + visitorCount + " visitor attended the event");
        System.out.printf("From those, %s (%s%%) were bringing a pet.\n", petCount, (petCount / visitorCount * 100));
        System.out.printf("From those, %s (%s%%) were bringing a hat.\n", hatCount, (hatCount / visitorCount * 100));
        System.out.printf("From those, %s (%s%%) were adult.\n", adultCount, (adultCount / visitorCount * 100));
        System.out.printf("From those, %s (%s%%) were bringing a kid.\n", parentCount, (parentCount / visitorCount * 100));
    }

    public static List<String> getVisitorsList() {
        List<String> guests = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            guests.add("Guest" + i);
        }
        return guests;
    }

    public static boolean isBringingAPet() {
        return true;
    }

    public static boolean isWearingAHat() {
        return false;
    }

    public static boolean isAdult() {
        return true;
    }

    public static boolean hasChildren() {
        return false;
    }
}
