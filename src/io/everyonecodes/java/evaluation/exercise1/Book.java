package io.everyonecodes.java.evaluation.exercise1;
//Each book should store its ISBN, title, the author's first and last name,
//number of pages, and whether or not it's currently borrowed by someone.
public class Book {
    int isbn;
    String title;
    String firstNameOfAuthor;
    String lastNameOfAuthor;
    int numberOfPages;
    boolean isBorrowed;

    public Book(int isbn, String title, String firstNameOfAuthor, String lastNameOfAuthor, int numberOfPages, boolean isBorrowed) {
        this.isbn = isbn;
        this.title = title;
        this.firstNameOfAuthor = firstNameOfAuthor;
        this.lastNameOfAuthor = lastNameOfAuthor;
        this.numberOfPages = numberOfPages;
        this.isBorrowed = isBorrowed;
    }
}
