package io.everyonecodes.java.community_exercises.carlos_classes_exercise1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        potentialContacts(getSalesTeam(), getContactList());
        potentialSalesReps(getSalesTeam(), getContactList());

        for (SalesRep salesRep : getSalesTeam()) {
            System.out.println(salesRep.leads);
        }
    }

    public static void potentialContacts(List<SalesRep> salesReps, List<Contact> contacts) {
        for (SalesRep salesRep : salesReps) {
            for (Contact contact : contacts) {
                if (salesRep.languages.contains(contact.language)) {
                    salesRep.leads++;
                }
            }
        }

        for (SalesRep salesRep : salesReps) {
            System.out.println(salesRep.name + " " + salesRep.leads);
        }
    }

    public static void potentialSalesReps(List<SalesRep> salesReps, List<Contact> contacts) {
        for (Contact contact : contacts) {
            System.out.println(contact.name + " can be called by: ");
            for (SalesRep salesRep : salesReps) {
                for (String language : salesRep.languages) {
                    if (contact.language.equals(language)) {
                        System.out.println(salesRep.name);
                    }
                }
            }
        }
    }

    public static List<SalesRep> getSalesTeam() {
        return List.of(
                new SalesRep("SalesR1", List.of("English", "German")),
                new SalesRep("SalesR2", List.of("German", "English", "French")),
                new SalesRep("SalesR3", List.of("French"))
        );
    }

    public static List<Contact> getContactList() {
        return List.of(
                new Contact("Contact1", "English", 0, 0, false),
                new Contact("Contact2", "German", 0, 0, false),
                new Contact("Contact3", "French", 1, 2, false),
                new Contact("Contact4", "English", 2, 1, true),
                new Contact("Contact5", "German", 3, 20, false),
                new Contact("Contact6", "French", 4, 4, true),
                new Contact("Contact7", "English", 5, 3, false),
                new Contact("Contact8", "German", 0, 0, false),
                new Contact("Contact9", "French", 0, 0, false),
                new Contact("Contact10", "English", 2, 2, false),
                new Contact("Contact11", "German", 3, 25, true),
                new Contact("Contact12", "English", 4, 1, true),
                new Contact("Contact13", "German", 5, 26, false),
                new Contact("Contact14", "English", 2, 2, false),
                new Contact("Contact15", "German", 1, 1, true),
                new Contact("Contact16", "German", 1, 0, false),
                new Contact("Contact17", "German", 0, 0, false),
                new Contact("Contact18", "French", 2, 1, true),
                new Contact("Contact19", "French", 3, 0, false),
                new Contact("Contact20", "French", 4, 2, false),
                new Contact("Contact21", "English", 0, 0, false),
                new Contact("Contact22", "German", 0, 0, false),
                new Contact("Contact23", "French", 1, 3, true),
                new Contact("Contact24", "English", 5, 24, false),
                new Contact("Contact25", "English", 1, 12, false)
        );
    }
}
