package io.everyonecodes.java.consolidation_fundamentals.exercise10;

import java.util.ArrayList;
import java.util.List;

//A big electronics store chain is asking for a new information system, which keeps track of all the computers they're selling.
//Model the following situation using classes. Even though not all properties of the classes have to be used (read/printed)
//in this exercise, it's crucial to be able to store this information, since it may be used in the future.
//
//The electronics chain has multiple stores. For each store, they want to store the first and last name of the manager,
//the number of floors for that store, and the total floor space, in square meters. Also, some stores have longer opening hours,
//that information should also be stored. Each store has multiple computers on offer.
//
//Each computer should store its brand, year of release, the amount of RAM in gigabytes, whether or not it has an SSD,
//and whether or not it has a dedicated graphics card. Also, since it's the most important component, information about
//the processor is stored.
//
//Each processor has a brand (which might be different from the computer's brand), a different number of cores, and a
//clock speed in gigahertz.
//
//In your main function, create at least 3 processors and computers, as well as a list of stores containing at least 2 stores
//(it's ok if they sell the same computers, to save you some typing).
//
//John wants to apply for the everyone codes course, so he writes a function that receives a list of stores, and returns a
//new list of computers that fulfill the minimum requirements for the course: It should not be older than from 2020,
//it should have an SSD, and it should have at least 8GB of RAM. Also, since John works late, he can only consider
//computers from stores that have long opening times.
//
//Call that function from the main function, and print all the computers' brands from the resulting list
//(if the same brand is included multiple times it's ok if it's also printed multiple times).
public class Main {
    public static void main(String[] args) {
        Processor processor1 = new Processor("AMD", 8, 2.4);
        Processor processor2 = new Processor("Intel", 4, 2.0);
        Processor processor3 = new Processor("M1", 6, 3.2);

        Computer computer1 = new Computer("Lenovo", 2021, 16, true, true, processor1);
        Computer computer2 = new Computer("Acer", 2018, 8, false, false, processor2);
        Computer computer3 = new Computer("Apple", 2020, 16, true, false, processor3);

        List<Store> stores = List.of(
                new Store("Mo", "Sef", 1, 2000, true, List.of(computer1, computer2, computer3)),
                new Store("NA", "JO", 2, 1000, true, List.of(computer3, computer2))
        );

        //List<Computer> suitableComputers = checkComputers(store);

//        for (Computer computer : suitableComputers) {
//            System.out.println(computer.brand);
//        }
        System.out.println(checkStore(stores));
    }

    public static String checkStore(List<Store> stores) {
        String result = "";
        for (Store store : stores) {
            if (store.hasLongOpeningHours) {
                result += store.firstName + ":" + '\n';
                for (Computer computer : checkComputers(store)) {
                    result += " " + computer.brand + '\n';
                }
            }
        }
        return result;
    }

    public static List<Computer> checkComputers(Store store) {
        // Check for age not older than 2020, should have SSd, at least 8GB RAM.
        List<Computer> approvedPcs = new ArrayList<>();

        for (Computer computer : store.computers) {
            if (computer.hasSsd && computer.ramInGb >= 8 && computer.yearOfRelease >= 2020) {
                approvedPcs.add(computer);
            }
        }
        return approvedPcs;
    }
}
