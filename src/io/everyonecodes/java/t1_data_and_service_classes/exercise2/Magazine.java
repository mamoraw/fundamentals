package io.everyonecodes.java.t1_data_and_service_classes.exercise2;

import io.everyonecodes.java.t1_data_and_service_classes.exercise1.Article;

import java.util.List;

//Define the Magazine class that contains a title and a list of articles. Provide getters for all properties.
public class Magazine {
    private String title;
    private List<Article> articles;

    public String getTitle() {
        return title;
    }

    public Magazine(String title, List<Article> articles) {
        this.title = title;
        this.articles = articles;
    }

    public List<Article> getArticles() {
        return articles;
    }
}
