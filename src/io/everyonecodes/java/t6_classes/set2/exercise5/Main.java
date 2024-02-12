package io.everyonecodes.java.t6_classes.set2.exercise5;

import java.util.List;

// At the music festival, the songs start playing and the audience rejoices and dances.
//
//Do the following:
//Define the Fan class that contains the name and isDancing properties.
//Define the Audience class that contains the fans and the mood properties.
//Define the updateMood function that receives an audience, calculates its mood depending on some factors and updates it
//in the received instance. The mood is amazing when more than 90% of the fans are dancing; it is great when the number
// of fans dancing is exactly between 60% and 90%; it is awful otherwise.
//Write code that creates an instance of Audience with an empty mood and plenty of fans, updates its mood, and prints its new mood.
//
//-- Example of what the code could print when asked for the audience’s mood
//The audience’s mood is amazing

public class Main {
    public static void main(String[] args) {
        List<Fan> fans = getFansInMusicFestival();
        Audience audience = new Audience(fans, "");

        updateMood(audience);

        System.out.println("The audience's mood is " + audience.mood);
    }

    // I had this function returning String, which is not necessary, as the mood is updated by the function updateMood.
    public static void updateMood(Audience audience) {
        int peopleDancing = 0;

        for (Fan fan : audience.fans) {
            if (fan.isDancing) {
                peopleDancing++;
            }
        }

        double sixtyPercent = audience.fans.size() * 0.6;
        double ninetyPercent = audience.fans.size() * 0.9;

        // using a ternary operator instead of if/else
        audience.mood = (peopleDancing > ninetyPercent) ? "amazing" : (peopleDancing < sixtyPercent) ? "awful" : "great";
//
//       if (peopleDancing >= sixtyPercent && peopleDancing <= ninetyPercent) {
//           audience.mood = "great";
//       } else if (peopleDancing > ninetyPercent) {
//           audience.mood = "amazing";
//       } else {
//           audience.mood = "awful";
//       }
    }

    public static List<Fan> getFansInMusicFestival() {
        return List.of(
                new Fan("Joe", true),
                new Fan("Jack", false),
                new Fan("Lisa", true),
                new Fan("Sarah", true),
                new Fan("Samantha", true),
                new Fan("Gill", false),
                new Fan("Laura", true),
                new Fan("John", true)
        );
    }
}
