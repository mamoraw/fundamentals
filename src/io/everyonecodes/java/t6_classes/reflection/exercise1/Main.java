package io.everyonecodes.java.t6_classes.reflection.exercise1;
//John loves travelling and has started writing down a travel diary with all the destinations where he has been.
//He wants to keep a record of each country's name that he has visited, when exactly was the last time he was there and
//the names of the particular places of that country that he visited.
//
//Do the following:
//Define the TravelDiary class that contains the country, the yearOfLastVisit and the places properties.
//In your Main class, define the printSummary function that receives several travel diaries as a list and prints
//the country and the year of the last visit of all of those that have at least one place visited.
//In your main method, create two different TravelDiary instances with any values of your choice.
//Modify the yearOfLastVisit property of one of the previously created instances.
//Add a value of your choice to the places property of one of the previously created instances.
//Define the diaries list with the travel diary instances you created previously.
//Write the code that John uses to print a summary of his diaries list.
//
//-- Example of what John prints while explaining a summary of his diaries
//I visited France in 2019
//I visited Finland in 2012

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TravelDiary firstDiary = new TravelDiary("First Diary", 2020, new ArrayList<>(List.of("Spain")));
        TravelDiary secondDiary = new TravelDiary("Second Diary", 2021, new ArrayList<>(List.of("France")));

        firstDiary.yearOfLastVisit = 2019;
        secondDiary.places.add("Italy");

        List<TravelDiary> diaries = List.of(firstDiary, secondDiary);

        printSummary(diaries);
    }

    public static void printSummary(List<TravelDiary> diaries) {
        for (TravelDiary diary : diaries) {
            // print all that have at least one place visited
            if (diary.places.size() >= 1) {
                for (String place : diary.places) {
                    System.out.println("I visited " + place + " in " + diary.yearOfLastVisit);
                }
            }
        }
    }
}
