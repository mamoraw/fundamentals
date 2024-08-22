package io.everyonecodes.java.fooling_around.Honey;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Round2 {

    public static void main(String[] args) throws IOException {
       List<String> honey = Files.readAllLines(Path.of("src/io/everyonecodes/java/fooling_around/Honey/level2_1"));
       List<String> result = indexOfLineW(honey).stream().map(Object::toString).toList();
        System.out.println(honey);



       Files.write(Path.of("src/io/everyonecodes/java/fooling_around/Honey/Level2_result"), result);


    }


    public static List<Integer> indexOfLineW(List<String> honey) {
        int indexOfLine = 0;
        List<Integer> counts = new ArrayList<>();

        for (int i = 0; i < honey.size(); i++) {
            String line = honey.get(i);
            if (line.contains("W")) {
                indexOfLine = i;
                int count = count(indexOfLine, indexOfW(line), honey);
                counts.add(count);
            }
        }

        return counts;
    }

    public static int indexOfW(String line) {
        int indexOfW = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'W') {
                indexOfW = i;
            }
        }

        return indexOfW;
    }

    public static int count(int indexOfLine, int indexOfW, List<String> honey) {
        int count = 0;
        String lineAbove = honey.get(indexOfLine - 1);
        String lineBelow = honey.get(indexOfLine + 1);
        String lineWithW = honey.get(indexOfLine);

        if (lineAbove.charAt(indexOfW -1) == 'O') {
            count ++;
        }
        if (lineAbove.charAt(indexOfW +1) == 'O') {
            count ++;
        }

        if (lineWithW.charAt(indexOfW -2) == 'O') {
            count ++;
        }
        if (lineWithW.charAt(indexOfW + 2) == 'O') {
            count ++;
        }

        if (lineBelow.charAt(indexOfW -1) == 'O') {
            count ++;
        }
        if (lineBelow.charAt(indexOfW + 1) == 'O') {
            count++;
        }

        return count;
    }
}
