package io.everyonecodes.java.community_exercises.own.number_plates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> validStartingLetters = new ArrayList<>(List.of("W", "G", "S", "L", "U", "M"));
        List<String> validNumbers = new ArrayList<>(List.of());
        askForPlate(validNumbers, validStartingLetters);

        System.out.println(validNumbers.get(0) + validNumbers.get(1) + validNumbers.get(2) + validNumbers.get(3));
        String test = "a";
        test += "b";
        System.out.println(test);
        addToString(validStartingLetters);
    }


    public static void isValidPlate(List<String> plate, List<String> validLetters) {
        if (validLetters.contains(plate.getFirst()) && plate.size() >= 4) {
            System.out.println("Nice Plate");
        } else {
            plate.removeAll(plate);
            System.out.println("Try again.");
            askForPlate(plate, validLetters);
        }
    }

    public static void askForPlate(List<String> validNumbers, List<String> letters) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib number/letter");
        validNumbers.add(scanner.nextLine().toUpperCase());
        if (validNumbers.size() < 4) {
            askForPlate(validNumbers, letters);
        } else if (validNumbers.size() == 4) {
            isValidPlate(validNumbers, letters );
        }
    }
    public static void addToString(List<String> letters) {
        String test = "Wax";
        if (letters.contains(test.substring(0, 1))) {
            System.out.println("nice");
        }
    }
}
