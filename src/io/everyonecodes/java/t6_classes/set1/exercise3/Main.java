package io.everyonecodes.java.t6_classes.set1.exercise3;
//Do the following:
//Define the Person class that contains the name of the person and a list of the names of the person’s friends.
//Create two Person instances with values of your choice.
//Add two friend names of your choice to one of the previously created instances.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> friendsOfHans = new ArrayList<>();
        List<String> friendsOfSepp = new ArrayList<>();

        Person hans = new Person("Hans", friendsOfHans);
        Person sepp = new Person("Sepp", friendsOfSepp);

        hans.friends.add("Freund1");
        hans.friends.add("Freund2");

        System.out.println(hans.friends);
        System.out.println(sepp.friends);
    }
}
