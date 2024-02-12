package io.everyonecodes.java.t1_data_and_service_classes.exercise2;

import io.everyonecodes.java.t1_data_and_service_classes.exercise1.Article;

//Define the Printer class that contains the print method which receives a magazine and displays its title and then
//prints all the articles like in exercise 1.
public class Printer {
    public static void printMagazine(Magazine magazine) {
        //Print the Title of the magazine.
        System.out.println(magazine.getTitle());
        //Prints each article title and text.
        for (Article article : magazine.getArticles()) {
            System.out.println(article.getTitle());
            System.out.println(article.getText());
        }
    }
}
