package io.everyonecodes.java.evaluation.exercise1;


import java.util.List;

//The library has multiple branches (locations). For each branch, they want to store the year in which the branch was opened,
//as well as the street name where the branch is located. Each branch has many books and magazines available for lending.
public class Library {
    int yearOpened;
    String streetName;
    List<Book> books;
    List<Magazine> magazines;

    public Library(int yearOpened, String streetName, List<Book> books, List<Magazine> magazines) {
        this.yearOpened = yearOpened;
        this.streetName = streetName;
        this.books = books;
        this.magazines = magazines;
    }
}
