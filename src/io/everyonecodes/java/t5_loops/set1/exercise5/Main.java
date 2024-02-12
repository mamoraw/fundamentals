package io.everyonecodes.java.t5_loops.set1.exercise5;

import java.util.List;
import java.util.ArrayList;
//Mugatu is hosting a new clothing design exposition in town and he has included the names of his
// best friends in the guest list. He values punctuality a lot, so he wants to give a VIP ticket to the
// first ten people that arrive at the event. He also plans to add a personal touch to the event and say goodbye
// personally to each guest before they leave.
//
//Define the greetGuests function that receives a guest list as a list and greets everyone on the list.
//In your main function, define the guests list using the getGuestNames function.
//Write code Mugatu can run to hand a VIP ticket to the first ten guests using the giveVIPTicket function.
//Define the sayGoodbye function that receives a guest list as a list and prints a personal goodbye to each guest
//
//Available functions (copy-paste this into your solution):

//-- Mugatu handing out VIP tickets
//- Matilda received a VIP ticket.
//- Hansel received a VIP ticket.
//- Derek received a VIP ticket.
//...
//-- Mugatu greeting people from his guest list
//- Hi Matilda, nice to see you!
//- Hi Hansel, nice to see you!
//- Hi Derek, nice to see you!
//...
//
//-- Mugatu saying goodbye to his guests before they leave
//- Goodbye Matilda, it’s been a pleasure to see you!
//- Goodbye Hansel, it’s been a pleasure to see you!
//- Goodbye Derek, it’s been a pleasure to see you!
//...
public class Main {
    public static void main(String[] args) {
        List<String> guestList = getGuestNames();

        int numberOfVips = 3;

        // only the first 10 guests should get a vip ticket, we do this with the if statement and count with i.
        // could also use the contains function. if the guest string contains 10, break.

        for (int i = 0; i < numberOfVips; i++) {
            String guest = guestList.get(i);
            giveVIPTicket(guest);
        }
//        int i = 0;
//        while (i < numberOfVips) {
//            String guest = guestList.get(i);
//            giveVIPTicket(guest);
//            i++;
//        }

        greetGuests(guestList);
        sayGoodbye(guestList);

    }

    public static void greetGuests(List<String> guestList) {
        for (String guest : guestList) {
            System.out.println("Hi, " + guest + " nice to see you.");
        }
    }

    public static List<String> getGuestNames() {
        List<String> guests = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            guests.add("Guest" + i);
        }
        return guests;
    }

    public static void giveVIPTicket(String guest) {
        System.out.println(guest + " received a VIP ticket.");
    }

    public static void sayGoodbye(List<String> guestList) {
        for (String guest : guestList) {
            System.out.println("Goodbye" + guest + " , it’s been a pleasure to see you!");
        }
    }
}
