package io.everyonecodes.java.t5_loops.set1.exercise10;

import java.util.ArrayList;
import java.util.List;

// Derek, Matilda and Hansel have started using nicknames for everything they encounter.
// They started playing around by just saying the first half of any word.
//
//Define the words list that contains the words they want to shorten using the getSomeWords function below.
//Define the nicknames list that is empty and will contain the nicknames.
//Write code that they run to create nicknames out of those words.
//
//Assume all words always have at least one letter.

public class Main {
    public static void main(String[] args) {
        List<String> words = getSomeWords();
        List<String> nicknames = new ArrayList<>(List.of());

        for (String word : words) {
            nicknames.add(word.substring(0, (int) (word.length() * 0.5)));
        }
        System.out.println(nicknames);
    }
    public static List<String> getSomeWords(){
        return List.of("gallery", "conviction", "performance", "diameter", "conservative", "constellation", "communication", "incentive");
    }
}
