package io.everyonecodes.java.t6_classes.set2.exercise5;

import java.util.List;

//Define the Audience class that contains the fans and the mood properties.
public class Audience {
    List<Fan> fans;
    String mood;

    public Audience(List<Fan> fans, String mood) {
        this.fans = fans;
        this.mood = mood;
    }
}
