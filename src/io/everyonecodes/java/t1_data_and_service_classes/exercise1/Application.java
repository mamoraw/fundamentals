package io.everyonecodes.java.t1_data_and_service_classes.exercise1;
//Matilda has finished writing an article and wants to print it. Develop the code that she uses to write an article and print it.
//
//Do the following:
//Define the Article class that contains a title and a text. Provide getters for all properties.
//Define the ArticlePrinter class that contains the print method which receives an article and just prints the title and the text on the screen.
//Define the Application class that contains the main method. Inside, create an article and a printer and print the article with the printer.

public class Application {
    public static void main(String[] args) {
        Article article = new Article("Title", "Text");
        ArticlePrinter printer = new ArticlePrinter(); // Create an instance of class ArticlePrinter.
        printer.printArticle(article); // Use the method .printArticle() to print the articles.
    }
}
