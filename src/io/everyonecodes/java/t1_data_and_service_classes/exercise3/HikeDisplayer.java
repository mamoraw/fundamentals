package io.everyonecodes.java.t1_data_and_service_classes.exercise3;

//Define the HikeDisplayer class that contains the display method which receives a hike and prints its date and the names of all hikers.
public class HikeDisplayer {
    public void display(Hike hike) {
        System.out.println(hike.getDate()); // Prints the date.

        for (Hiker hiker : hike.getHikers()) { // Prints the individual Hiker names.
            System.out.println(hiker.getName());
        }
    }
}
