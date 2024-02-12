package io.everyonecodes.java.t5_loops.set1.exercise7;
// Matilda wants to quote a very nice line from a book she has read a few days ago but she doesn’t remember the exact phrase anymore.
// So, she searches through the exactly 200 pages to find the quote.
//
//Write code that Matilda uses to search through the book and print the page number when she has found the right page.
// Remember that page numbers start with 1.
//
//-- Matilda after finding the right page that contains the quote
//- Found it! It’s on page 42!
public class Main {
    public static void main(String[] args) {
        int numberOfPages = 200;

        for (int page = 1; page <= numberOfPages; page++ ) {
            if (containsQuote(page)) {
                System.out.println("Found it, is on page " + page);
                break; // use break to end the loop early. else it would run through the 200 pages.
            }
        }
    }
    public static boolean containsQuote(int pageNumber) {
//        It so happens that the quote was on page 42! Go figure!
        return pageNumber == 42;
    }
}
