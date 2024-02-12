package io.everyonecodes.java.evaluation.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 0;

        System.out.println("How many students are there?");
        numberOfStudents = scanner.nextInt();
        scanner.nextLine();
        // Creating a list for the student names.
        List<String> studentNames = new ArrayList<>();
        int counter = 1;
        while (counter <= numberOfStudents) {
            System.out.println("Enter name of student " + counter + ":");
            studentNames.add(scanner.nextLine());
            counter++;
        }
        // Creating a list for the grades.
        List<Double> grades = new ArrayList<>();
        for (String student : studentNames) {
            System.out.println("What grade did " + student + " get?");
            grades.add(scanner.nextDouble());
        }
        // Looping through the names and match them with their grade to find the honor students.
        System.out.println("What is the minimum grade to be an honor student?");
        double honorMinimum = scanner.nextDouble();
        for (int i = 0; i < studentNames.size(); i++) {
            if (grades.get(i) >= honorMinimum) {
                System.out.println(studentNames.get(i) + " is an honor student with a grade of: " + grades.get(i));
            }
        }
        // Print the average grade for honor students and the overall average.
        System.out.println("The average grade for all students is: " + averageOfAllStudents(grades, honorMinimum));
        System.out.println("The average grade for the honor students is: " + honorStudentsAverageGrade(grades, honorMinimum));
        // Get highest and lowest grade.
        double highestGrade = grades.getFirst();
        double lowestGrade = grades.getFirst();
        for (double grade : grades) {
            if (grade > highestGrade) {
                highestGrade = grade;
            } else if (grade < lowestGrade) {
                lowestGrade = grade;
            }
        }
        System.out.println("The student with the highest grade (" + highestGrade + ") is: " + studentNames.get(grades.indexOf(highestGrade)));
        System.out.println("The student with the lowest grade (" + lowestGrade + ") is: " + studentNames.get(grades.indexOf(lowestGrade)));
    }

    public static double averageOfAllStudents(List<Double> grades, double minimum) {
        double averageGrade = 0;
        for (double grade : grades) {
            averageGrade += grade;
        }
        return averageGrade / grades.size();
    }

    public static double honorStudentsAverageGrade(List<Double> grades, double honorMinimum) {
        double average = 0;
        int counter = 0;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >= honorMinimum) {
                average += grades.get(i);
                counter++;
            }
        }
        return average / counter;
    }
}
