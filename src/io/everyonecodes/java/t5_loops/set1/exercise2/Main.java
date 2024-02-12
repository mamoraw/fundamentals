package io.everyonecodes.java.t5_loops.set1.exercise2;
// Write the code that the magician runs to ask for the number in the way described below until someone says
// a number between 1 and 10, inclusive.
//
//- Say a number between 1 and 10
//- 0
//- Say a number between 1 and 10
//- 12
//- Say a number between 1 and 10
//- 9
//- Alright! Let’s perform a trick with the number 9.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        while (true) {
            System.out.println("Say a number between 1 and 10");
            Scanner scanner =new Scanner(System.in);
            number = scanner.nextInt();
            if (number >= 1 && number <= 10) {
                System.out.println("Alright! Let’s perform a trick with the number " + number);
                break;
            }
        }
    }
//         System.out.println("Say a number between 1 and 10");
//    Scanner scanner = new Scanner(System.in);
//    int number = scanner.nextInt();
//        while (number < 1 || number > 10) {
//        System.out.println("Say a number between 1 and 10");
//        number = scanner.nextInt();
//    }
//        System.out.println("Alright! Let’s perform a trick with the number " + number + ".");
//}
}

