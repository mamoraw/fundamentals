package ccc;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ccc {
    public static HashMap<String, Integer> doSomething(List<String> lines) {

        HashMap<String, Integer> map = new HashMap<>();

        // Loop through each line
        for (String line : lines) {
            // Split each line into words using space as a delimiter
            String[] words = line.split(" "); // Split by spaces or multiple spaces

            // Loop through each word
            for (String word : words) {
                String[] split = word.split(",");
                // Count K's
                int count = 0;
                for (String s : split) {
                    if (s.equalsIgnoreCase("k")) {
                        count += 1;
                    }
                    if (count == 4) {
                        map.put(word, map.getOrDefault(word, 0) + count);
                    } else if (count == 3) {
                        // only add the first time it is encountered as a key, after that increase the int value
                        map.put(word, map.getOrDefault(word, 0) + count);
                    }

                }
                // Increment the count of the word in the map
//                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        try {
            // Read lines from the file
            List<String> lines = Files.readAllLines(Path.of("src/ccc/level2_1.in"));

            // Get the word count map
            Map<String, Integer> map = doSomething(lines);

            for (String word : map.keySet()) {
                System.out.println(map.get(word) + " " + word);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


