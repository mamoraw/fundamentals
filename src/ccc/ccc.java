package ccc;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ccc {
//    public static HashMap<String, Integer> doSomething(List<String> lines) {
//
//        HashMap<String, Integer> map = new HashMap<>();
//
//        // Loop through each line
//        for (String line : lines) {
//            // Split each line into words using space as a delimiter
//            String[] words = line.split(" "); // Split by spaces or multiple spaces
//
//            // Loop through each word
//            for (String word : words) {
//                String[] split = word.split(",");
//                // Count K's
//                int count = 0;
//                for (String s : split) {
//                    if (s.equalsIgnoreCase("k")) {
//                        count += 1;
//                    }
//                    if (count == 4) {
//                        map.put(word, map.getOrDefault(word, 0) + count);
//                    } else if (count == 3) {
//                        // only add the first time it is encountered as a key, after that increase the int value
//                        map.put(word, map.getOrDefault(word, 0) + count);
//                    }
//
//                }
//                // Increment the count of the word in the map
////                map.put(word, map.getOrDefault(word, 0) + 1);
//            }
//        }
//        return map;
//    }
//
//    public static void main(String[] args) {
//        try {
//            // Read lines from the file
//            List<String> lines = Files.readAllLines(Path.of("src/ccc/level2_1.in"));
//
//            // Get the word count map
//            Map<String, Integer> map = doSomething(lines);
//
//            for (String word : map.keySet()) {
//                System.out.println(map.get(word) + " " + word);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
// Method to check for mistakes and fix the puzzle
public static String[][] fixPuzzle(String[][] puzzle, int size) {
    String[][] fixedPuzzle = new String[size][size];

    // Copy the puzzle matrix to the fixed puzzle initially
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            fixedPuzzle[i][j] = puzzle[i][j];
        }
    }

    // Iterate through each piece and check for mistakes
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            String[] piece = puzzle[i][j].split(",");

            // Check right neighbor
            if (j + 1 < size) {
                String[] rightPiece = puzzle[i][j + 1].split(",");
                if (hasMistake(piece[1], rightPiece[3])) {
                    // Fix the mistake by modifying one of the pieces
                    fixedPuzzle[i][j] = fixPiece(piece, 1);
                }
            }

            // Check bottom neighbor
            if (i + 1 < size) {
                String[] bottomPiece = puzzle[i + 1][j].split(",");
                if (hasMistake(piece[2], bottomPiece[0])) {
                    // Fix the mistake by modifying one of the pieces
                    fixedPuzzle[i][j] = fixPiece(piece, 2);
                }
            }
        }
    }

    return fixedPuzzle;
}

    // Method to check if there is a mistake (same connection types)
    private static boolean hasMistake(String sideA, String sideB) {
        return (sideA.equals("K") && sideB.equals("K")) || (sideA.equals("H") && sideB.equals("H"));
    }

    // Method to fix a piece by changing one side (based on the mistake side index)
    private static String fixPiece(String[] piece, int sideIndex) {
        // Modify the side that caused the mistake (either change K to H or H to K)
        if (piece[sideIndex].equals("K")) {
            piece[sideIndex] = "H";
        } else if (piece[sideIndex].equals("H")) {
            piece[sideIndex] = "K";
        }
        return String.join(",", piece); // Return the modified piece
    }

    // Method to read the puzzle from an input file
    public static String[][] readPuzzleFromFile(String inputFilePath, int size) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        String[][] puzzle = new String[size][size];

        // Skip the first line (puzzle size)
        reader.readLine();

        // Read the puzzle into a 2D array starting from the second line
        for (int i = 0; i < size; i++) {
            String line = reader.readLine();
            puzzle[i] = line.split(" ");
        }

        return puzzle;
    }

    // Method to write the fixed puzzle to the output file
    public static void writePuzzleToFile(String[][] puzzle, String outputFilePath, int size) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

        // Write each row of the puzzle
        for (int i = 0; i < size; i++) {
            writer.write(String.join(" ", puzzle[i]) + "\n");
        }

        writer.close();
    }

    public static void main(String[] args) {
        String inputFilePath = "src/io/everyonecodes/java/catcoder/level3/level3_5.in"; // Input file with the puzzle
        String outputFilePath = "src/io/everyonecodes/java/catcoder/level3/level3_5.txt"; // Output file for the fixed puzzle

        try {
            // Read the puzzle size and the puzzle matrix
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            int size = Integer.parseInt(reader.readLine().trim()); // First line is the size of the puzzle
            String[][] puzzle = readPuzzleFromFile(inputFilePath, size);

            // Fix the puzzle
            String[][] fixedPuzzle = fixPuzzle(puzzle, size);

            // Write the fixed puzzle to the output file
            writePuzzleToFile(fixedPuzzle, outputFilePath, size);

            System.out.println("Puzzle fixed and written to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


