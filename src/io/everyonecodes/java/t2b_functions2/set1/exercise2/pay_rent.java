package io.everyonecodes.java.t2b_functions2.set1.exercise2;

import io.everyonecodes.java.t1_variables.set1.exercise3.john;

import java.util.Scanner;

public class pay_rent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = 4;

        System.out.println("What is the total rent?");
        double totalRent = scanner.nextDouble();

        payRent("John", splitRent(numberOfPeople, totalRent));
        payRent("Julia", splitRent(numberOfPeople, totalRent));
        payRent("Andi", splitRent(numberOfPeople, totalRent));
        payRent("Felix", splitRent(numberOfPeople, totalRent));
    }
    public static double splitRent(int people, double totalRent) {
        //  receives the rent amount and the number of people living in the apartment,
        //  and returns the amount split by the number of people
        return totalRent / people;
    }
    public static String askPersonForIBAN(String name) {
        //  receives a name, asks this person for their bank account's
        //  IBAN (see the interaction below) and returns it as String.
        Scanner scanner = new Scanner(System.in);

        System.out.println(name + ", what is your bank account's IBAN?");
        return scanner.nextLine();
    }
    public static void payRent(String name, double rentPerPerson) {
        // String iban = askPersonForIBAN(name);
        // transferMoney(iban, rentPerPerson);
        transferMoney(askPersonForIBAN(name), (rentPerPerson));
        System.out.println("Your payment of " + rentPerPerson + " Euro is done!");
    }
    public static void transferMoney(String iban, double amount) {
        System.out.println("Transfer successful.");
    }
}
