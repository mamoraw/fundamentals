package io.everyonecodes.java.t2a_functions1.reflection.exercise2;

/* Sarah is sending out invites for her wedding. She's trying to decide how to print the wedding invitations.
She's not sure in which order she'd like to have first name, last name, title and whether she should include the year of birth.

Do the following:
In your main function, write code asking the user for their first name, last name, year of birth, and title.
Follow the interaction below. You can assume that everyone has a title.
Write a function that receives all those values you read in above as parameters.
The function should then print the name multiple times, in different orders, as shown below. Call your function from the main function.

Please enter the first name:
David
Please enter the last name:
Attenborough
Please enter the year of birth:
1926
Please enter the title:
Sir
Different ways to display the name:
David Attenborough
David Attenborough, Sir
Sir Attenborough, David
Sir David Attenborough
Sir David Attenborough, born 1926 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please enter the last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Please enter the year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the title: ");
        String title = scanner.nextLine();

        printNamesAndTitlesInDifferentOrder(firstName, lastName, yearOfBirth, title);
    }
    public static void printNamesAndTitlesInDifferentOrder(String name, String lastName, int yearOfBirth, String title) {
        System.out.println("Different ways to display the name: ");
        System.out.println(name + " " + lastName);
        System.out.println(name + " " + lastName + ", " + title);
        System.out.println(title + " " + lastName + ", " + name);
        System.out.println(title + " " + name + " " +lastName);
        System.out.println(title + " " + name + " " + lastName + ", born " + yearOfBirth);
    }

}
