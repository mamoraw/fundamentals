package io.everyonecodes.java.t6_classes.set2.exercise4;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

//Derek goes with Matilda to a music festival to listen to their favourite artists.
//
//Do the following:
//Define the MusicFestival class that contains the name and the artistNames properties.
//Create one MusicFestival instance with at least three artist names.
//Add two extra artist names to the previously created instance because they confirmed playing in the festival in a short notice.
//Modify the previously created instance’s name property with the same value, but add two exclamation marks at the end
//because the two extra artists are super famous.
//Write code that prints all the artist names of the previously created instance.
//
//-- Example of what the code could print when asked for the music festival artist names
//Artists confirmed for the festival:
//Fall Out Boy
//Odesza
//Pretty Lights
//Eminem
//Above & Beyond
public class Main {
    public static void main(String[] args) {
        List<String> artistNames = new ArrayList<>(List.of("Odesza", "Laut", "Musi"));

        MusicFestival festival = new MusicFestival("Festival", artistNames);

        festival.artistNames.add("toLate");
        festival.artistNames.add("veryLate");

        festival.name += "!!";

        System.out.println(festival.name);

        // !! for the last to artist. That's what I thought we were supposed to do.
        // for each would work with artistName = artistName + "!!";

        for (String artistName : festival.artistNames) {
            if (artistName.equals("toLate")) {
                artistNames.set(artistNames.indexOf(artistName), "toLate!!");
            } else if (artistName.equals("veryLate")) {
                artistName += "!!";
            }
        }

//        for (int i = 0; i < artistNames.size(); i++) {
//            if (artistNames.get(i).equals("toLate")) {
//                artistNames.set(i, "toLate!!");
//            } else if (artistNames.get(i).equals("veryLate")) {
//                artistNames.set(i, "veryLate!!");
//            }
//        }

        for (String artistName : festival.artistNames) {
            System.out.println(artistName);
        }
    }
}
