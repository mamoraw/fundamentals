package io.everyonecodes.java.t1_data_and_service_classes.exercise2;

import io.everyonecodes.java.t1_data_and_service_classes.exercise1.Article;

import java.util.List;

//Define the Editor class that contains the writeMagazine method which doesn't take any arguments and returns a
//magazine. In order to create a magazine, it first creates three articles (with values of your choice),
//then the magazine and finally returns it.
public class Editor {

    public static Magazine writeMagazine() {
        //create 3 articles and return a magazine with them.
        Article article1 = new Article("This is a title", "This is a text");
        Article article2 = new Article("Another title", "And another text");
        Article article3 = new Article("Yes, title", "Ahh, a text");
        return new Magazine("This is a Magazine Title", List.of(article1, article2, article3));
    }
}
