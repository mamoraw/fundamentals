package io.everyonecodes.java.consolidation_fundamentals.exercise10;

import java.util.List;

public class Store {
    String firstName;
    String lastName;
    int floors;
    int squareMeters;
    boolean hasLongOpeningHours;
    List<Computer> computers;

    public Store(String firstName, String lastName, int floors, int squareMeters, boolean openingHours, List<Computer> computers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.floors = floors;
        this.squareMeters = squareMeters;
        this.hasLongOpeningHours = openingHours;
        this.computers = computers;
    }
}
