package io.everyonecodes.java.t1_variables.set1.exercise10;

public class book {

    public static void main(String[] args) {

        int pages = 250;
        int days = 30;

        // type casting is needed, if not it will show only the integer 8 and nothing behind the comma

        double pagesPerDay = (double)pages / days;
        System.out.println("You have to read " + pagesPerDay);
    }
}
