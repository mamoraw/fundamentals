package io.everyonecodes.java.t1_data_and_service_classes.exercise3;

import java.util.List;

//Define the Hike class that contains the date of the hike (use a string) and a list of hikers. Provide getters for all properties.
public class Hike {
    private String date;
    List<Hiker> hikers;

    public Hike(String date, List<Hiker> hikers) {
        this.date = date;
        this.hikers = hikers;
    }

    public String getDate() {
        return date;
    }

    public List<Hiker> getHikers() {
        return hikers;
    }
}
