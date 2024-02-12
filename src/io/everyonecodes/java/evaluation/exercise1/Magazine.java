package io.everyonecodes.java.evaluation.exercise1;
//Magazines can't be borrowed, only read at the library. Their name and issue number should be stored.
//Some magazines are color prints, which makes them more expensive for the library to purchase, so that information should also be stored.
public class Magazine {
    String title;
    int isbn;
    boolean isColorPrint;


    public Magazine(String title, int isbn, boolean isColorPrint) {
        this.title = title;
        this.isbn = isbn;
        this.isColorPrint = isColorPrint;
    }
} 
