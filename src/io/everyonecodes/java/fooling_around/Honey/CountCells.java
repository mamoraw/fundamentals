package io.everyonecodes.java.fooling_around.Honey;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountCells {
    public static void main(String[] args) throws IOException {
        String honey = """
10

O-X-X-O-O-X-O-O-O-O-X-O-O-O-X-O-
-O-X-O-O-O-W-O-O-X-X-X-O-O-X-X-X
O-O-O-X-O-X-O-O-O-X-X-X-X-O-O-X-
-X-X-O-O-O-X-X-X-O-X-O-O-X-O-O-O

O-X-O-O-O-X-X-X-O-O-X-O-X-X-X-X-
-O-O-X-O-O-X-O-X-O-X-X-O-O-O-X-X
X-O-O-X-X-O-O-X-O-X-O-X-W-X-O-X-
-O-O-X-O-O-O-O-O-O-O-O-O-O-X-O-O

X-X-X-O-O-O-X-X-X-O-O-O-O-O-X-O-
-O-O-O-O-O-O-O-O-X-O-O-X-O-O-O-X
X-O-O-X-O-X-X-O-X-O-O-W-O-O-O-O-
-O-O-O-O-O-O-X-O-O-O-X-O-O-X-X-O

X-O-X-X-O-O-O-X-X-X-X-X-X-O-X-X-
-O-O-X-X-O-O-O-O-O-O-O-X-O-X-O-O
O-X-O-O-X-O-W-X-O-O-X-O-O-O-O-O-
-X-X-O-O-X-O-O-O-X-X-X-O-X-X-O-X

O-X-O-X-X-X-O-O-O-O-O-O-X-O-X-O-
-O-O-X-O-O-X-O-O-X-X-W-X-O-X-X-X
O-O-O-O-O-O-O-O-O-O-O-X-O-O-O-X-
-O-X-X-O-X-X-O-O-O-O-O-O-X-O-X-O

X-O-X-X-O-X-X-X-O-O-O-O-X-O-X-X-
-X-X-O-W-O-X-X-X-O-X-X-O-X-X-O-X
O-O-O-X-O-O-O-O-X-O-X-X-X-O-X-O-
-O-X-X-X-X-X-X-X-X-O-X-O-O-O-X-X

X-O-O-O-O-X-X-O-O-O-O-O-O-O-X-O-
-O-O-X-O-O-X-O-X-O-O-X-O-O-O-O-X
X-X-X-O-O-O-X-O-O-O-W-O-X-X-X-O-
-X-X-X-X-O-O-X-O-X-X-X-O-X-O-X-O

O-O-X-O-O-X-O-O-O-O-X-O-O-X-O-X-
-O-X-X-X-O-O-O-O-X-O-O-O-O-O-O-X
O-X-O-O-O-O-X-X-O-X-O-W-X-X-X-X-
-X-O-O-X-X-O-O-O-X-O-O-X-O-O-X-O

O-O-X-X-X-O-X-O-O-O-O-O-O-X-X-O-
-O-O-O-W-O-X-O-O-X-X-X-O-X-O-X-O
O-O-O-O-O-O-X-X-X-X-O-X-X-X-X-X-
-X-O-O-O-O-O-O-O-X-O-X-O-O-O-X-O

O-X-X-O-O-O-X-O-O-X-O-X-O-O-X-X-
-X-X-X-W-X-X-O-X-X-X-X-O-O-O-O-O
X-O-O-O-X-O-O-X-X-O-X-O-X-X-O-O-
-X-O-X-O-X-O-O-X-O-O-O-O-X-X-O-O

                """;


        cellCount(honey);
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
