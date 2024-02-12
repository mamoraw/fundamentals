package io.everyonecodes.java.t1_data_and_service_classes.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Define the HikerGatherer class that contains the gather method which asks for hiker’s names and telephone numbers indefinitely
//until it receives an empty string as a name and returns the list of hikers that signed up for the hike.
public class HikeGatherer {
    public List<Hiker> gather() {
        Scanner scanner = new Scanner(System.in);
        List<Hiker> hikers = new ArrayList<>();
        // Asking for name until scanner is empty and adds the values to the hikers list inside an instance of class Hiker, then returns the list.
        while (true) {
            System.out.println("What is your name?");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("What is your telephone number?");
            String telephoneNumber = scanner.nextLine();
            hikers.add(new Hiker(name, telephoneNumber));
        }
        return hikers;
    }
}
