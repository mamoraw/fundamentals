package io.everyonecodes.java.t1_variables.set1.exercise2;
//Formulate one real life problem within the topic of fitness. Define at least three variables, store sensible initial values,
// and perform some calculation on it, to solve the problem that you formulated. Print the result as part of a full sentence.
//BMI = Körpergewicht : (Körpergröße)2
public class fitness {

    public static void main(String[] args) {

        double height = 1.86;
        double weight = 86;

        double heightSquare = height * height;
        double bmi = weight / heightSquare;

        System.out.println("Your BMI is: " + bmi);
    }
}
