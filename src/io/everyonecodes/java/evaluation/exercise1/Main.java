package io.everyonecodes.java.evaluation.exercise1;
//A library is asking for a new library information system, which keeps track of all their books and magazines.
//Model the following situation using classes. Even though not all properties of the classes have to be used
//(read/printed) in this exercise, it's crucial to be able to store this information, since it may be used in the future.
//
//The library has multiple branches (locations). For each branch, they want to store the year in which the branch was opened,
//as well as the street name where the branch is located. Each branch has many books and magazines available for lending.
//Each book should store its ISBN, title, the author's first and last name, number of pages, and whether or not it's currently
//borrowed by someone.
//Magazines can't be borrowed, only read at the library. Their name and issue number should be stored. Some magazines are
//color prints, which makes them more expensive for the library to purchase, so that information should also be stored.

//In your main function, create at least one library branch, containing at least two books and two magazines.
//Also, the library has noticed that people really like to borrow shorter books. Implement a function that takes a library
//branch as its input parameter, and returns a new list, containing only those books which are available (currently not being borrowed),
//and that have a maximum of 200 pages. Call that function from the main function, and print all the titles of the books in the resulting list.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(123, "Example1", "Max", "Musterman", 100, true);
        Book book2 = new Book(112, "Example2", "Alex", "Musterfrau", 100, false);
        Magazine magazine1 = new Magazine("mag1", 111, true);
        Magazine magazine2 = new Magazine("mag2", 222, false);
        Library library = new Library(1990, "Mustergasse", List.of(book1, book2), List.of(magazine1, magazine2));

        for (Book book : availableBooks(library)) {
            System.out.println(book.title);
        }
    }

    public static List<Book> availableBooks(Library library) {
        List<Book> availableBooks = new ArrayList<>();

        for (Book book : library.books) {
            // Check it the book is not borrowed.
            if (!book.isBorrowed && book.numberOfPages <=200) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
}
