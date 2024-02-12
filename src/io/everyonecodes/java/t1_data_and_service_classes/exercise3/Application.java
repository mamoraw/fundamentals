package io.everyonecodes.java.t1_data_and_service_classes.exercise3;
import java.util.List;
//Matilda organizes a hiking day with her friends on the weekend, but she’s not sure who is coming.
//She wants to collect each hiker’s name and telephone number (in case the meeting point changes),
//so she decides to create an application, so they can sign up. The application behaves like follows:

//It asks for the name of the hiker
//If they write their name and press enter, they have to write their telephone number and then get signed up
//If they press enter without writing their name, it stops asking for more hikers
//After that it displays the list of everyone who signed up
//
//Do the following:
//Define the Hiker class that contains the hiker’s name and their telephone number. Provide getters for all properties.
//Define the Hike class that contains the date of the hike (use a string) and a list of hikers. Provide getters for all properties.
//Define the HikerGatherer class that contains the gather method which asks for hiker’s names and telephone numbers indefinitely
//until it receives an empty string as a name and returns the list of hikers that signed up for the hike.
//Define the HikeDisplayer class that contains the display method which receives a hike and prints its date and the names of all hikers.
//Define the Application class that contains the main method. Inside, create a new hike with hikers and display it.

public class Application {
    public static void main(String[] args) {
        HikeGatherer gatherHikers = new HikeGatherer();
        List<Hiker> hikers = gatherHikers.gather(); // Use the service class HikeGatherer to receive a List of Hikers.

        Hike hike = new Hike("6.2.2024", hikers);
        HikeDisplayer hikeDisplayer = new HikeDisplayer();
        hikeDisplayer.display(hike); // Prints everything.
    }
}
