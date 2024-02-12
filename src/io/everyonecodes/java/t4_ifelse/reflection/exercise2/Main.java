package io.everyonecodes.java.t4_ifelse.reflection.exercise2;

import java.util.List;
import java.util.Scanner;

// When it is not at home it greets only him (Derek) and his friends Hansel and Matilda.
//When it is at home it greets everyone.
//
//Define the isAtHome function that asks the user whether they are at home and returns a boolean with the answer.
//Define the greetSomeone function that the robo-puppy uses to fulfill the behaviour described above.
// The function should not have any arguments or return values. Use the appropriate Scanner method and System.out.println in the
//function's body for input and output respectively. See below for example output in different situations.
//Call the greetSomeone function from your main function.
//
//-- Expected behavior while not at home with a friend
//- Are we at home?
//- false
//- Woof is this person’s name?
//- Hansel
//- Hi there, Hansel!
//
//-- Expected behavior while not at home with a stranger
//- Are we at home?
//- false
//- Woof is this person’s name?
//- Mugatu
//
//-- Expected behavior while at home with a friend
//- Are we at home?
//- true
//- Woof is this person’s name?
//- Matilda
//- Hi there, Matilda!
//
//-- Expected behavior while at home with a stranger
//- Are we at home?
//- true
//- Woof is this person’s name?
//- Mugatu
//- Hi there, Mugatu!

public class Main {
    public static void main(String[] args) {
        greetSomeone();
    }

    public static boolean isAtHome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are we at home?");
        return scanner.nextBoolean();
    }

    public static void greetSomeone() {
        List<String> namesOfFriends = List.of("Derek", "Hansel", "Matilda");
        Scanner scanner = new Scanner(System.in);

        boolean isAtHome = isAtHome();

        System.out.println("Woof is this person’s name?");
        String name = scanner.nextLine();
        if (isAtHome || namesOfFriends.contains(name)) {
            System.out.println("Hi there, " + name + "!");
        } else {
            System.out.println("ignore");
        }
    }
}
