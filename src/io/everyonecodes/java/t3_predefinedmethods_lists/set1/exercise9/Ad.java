package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise9;

import java.util.ArrayList;
import java.util.List;

// Write code that defines the message below, transforms it into small letters and prints it.
//Define the words list with the three different words of the message below.
//Write code that transforms every word of the words list into small letters. 
// Take the words from the list, transform them one by one and put them back in the right order. Print the list.
//Original mailbox message: PLEASE NO ADVERTISEMENT
//Transformed mailbox message: please no advertisement

public class Ad {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("PLEASE", "NO", "ADVERTISEMENT"));
        System.out.println(words);

        words.add(0, words.remove(0).toLowerCase());
        words.add(1, words.remove(1).toLowerCase());
        words.add(2, words.remove(2).toLowerCase());

        System.out.println(words);
    }
    // with a function instead of nesting

    // List<String> words = new ArrayList<>(List.of("PLEASE", "NO", "ADVERTISEMENT"));
    //
    //        replaceWordWithLowercasedWord(words);
    //        replaceWordWithLowercasedWord(words);
    //        replaceWordWithLowercasedWord(words);
    //
    //        System.out.println(words);
    //    }
    //
    //    public static void replaceWordWithLowercasedWord(List<String> words) {
    //        String word = words.get(0);
    //        word = word.toLowerCase();
    //        words.remove(0);
    //        words.add(word);
    //    }
}
