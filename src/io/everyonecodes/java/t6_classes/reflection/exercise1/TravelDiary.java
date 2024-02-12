package io.everyonecodes.java.t6_classes.reflection.exercise1;

import java.util.List;

//Define the TravelDiary class that contains the country, the yearOfLastVisit and the places properties.
public class TravelDiary {
    String name;
    int yearOfLastVisit;
    List<String> places;

    public TravelDiary(String name, int yearOfLastVisit, List<String> places) {
        this.name = name;
        this.yearOfLastVisit = yearOfLastVisit;
        this.places = places;
    }
}
