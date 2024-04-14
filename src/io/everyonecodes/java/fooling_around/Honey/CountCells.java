package io.everyonecodes.java.fooling_around.Honey;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountCells {
    public static void main(String[] args) throws IOException {

    }

    public static void cellCount(String honeyComb) throws IOException {
        int count = 0;


        for (char o : honeyComb.toCharArray()) {
            if (o == 'O') {
                count++;
            }
        }


        Files.write(Path.of("src/io/everyonecodes/java/fooling_around/Honey/level3"), String.valueOf(count).getBytes());
    }
}
