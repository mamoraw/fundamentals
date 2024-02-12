package io.everyonecodes.java.community_exercises.number_plates_v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// create a number plate that contains the following:
// starts with a string provided in the validLetters list, ends with a letter,contains at least two numbers,
// is at least 4 characters long,
// asks the user again for a numberplate if the input is not valid.
public class Main {
    public static void main(String[] args) {
        List<String> validLetters = List.of("sbg", "vbg", "w", "noe", "ooe", "stmk", "t", "ktn", "bgld");
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        Scanner scanner = new Scanner(System.in);

        String checkNumberPlate = "";

        do {
            System.out.println("What plate do you want?");
            checkNumberPlate = scanner.nextLine();
        } while (!checkLength(checkNumberPlate)
                || !startsWithLetter(checkNumberPlate, validLetters)
                || !containsNumbers(checkNumberPlate, numbers)
                || !endsWithLetter(checkNumberPlate, numbers));

        System.out.println("Your plate is valid: " + checkNumberPlate.toUpperCase());
    }

    public static boolean checkLength(String numberPlate) {
        return numberPlate.length() >= 4 && numberPlate.length() < 8;
    }

    public static boolean startsWithLetter(String numberPlate, List<String> validLetters) {
        for (String letter : validLetters) {
            if (numberPlate.startsWith(letter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsNumbers(String numberPlate, List<Integer> numbers) {
        int counter = 0;
        String subStringToCheck = numberPlate.substring(1, numberPlate.length() - 1);

        for (char letter : subStringToCheck.toCharArray()) {
            for (int number : numbers) {
                String num = String.valueOf(number);
                if (String.valueOf(letter).equals(num)) {
                    counter++;
                    break;
                }
            }
        }
        return counter >= 2;
    }

    public static boolean endsWithLetter(String numberPlate, List<Integer> numbers) {
        for (int number : numbers) {
            if (numberPlate.endsWith(String.valueOf(number))) {
                return false;
            }
        }
        return true;
    }
}
