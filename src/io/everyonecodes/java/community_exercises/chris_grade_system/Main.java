package io.everyonecodes.java.community_exercises.chris_grade_system;

import java.util.List;

//It’s the end of the semester and it is grading time. Isabel, Keisha, Ronald and Alfred handed in all their assignments and
//are eager to learn the grades they received overall. Will their summer start with a boost or a bummer? Let’s see what the school
//grading system spits out for each of them.
//
//Define the Class ’Student’ with the properties ‘name’ and ‘assignmentScores’.
//Define the method ‘displayStudentInfo’ which receives a student Class and prints the score information (see print examples below).
//Important here is, you cannot use the ‘normal’ ‘println’ method, use the ‘printf’ method instead. Make sure you only print one decimal maximum.
//Define the method ‘calculateAverage’ which also receives a student Class and calculates the average score and returns it.
//Define the method ‘getGrade’ which receives the average score and returns a grade (char).
//Create a list per student with their scores (from 0.00 to 100.0). [every list has 4 scores. To be added at your leisure]
//Define an instance per student.
//Write code that calls the above methods from the Main.
//
//Examples of what your print results should look like
//
//Student: Isabel
//Average Score: 87.5
//Grade: B
//
//Student: Keisha
//Average Score: 86.3
//Grade: B
//
//Student: Ronald
//Average Score: 89.0
//Grade: B
//
//Student: Alfred
//Average Score: 77.3
//Grade: C
//
//Can you make the Grade system work and send our students home with a smile on their faces? Good luck!
//
//Please reach out if you would like to see the result.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Hans", List.of(87.6, 67.9, 56.0, 90.7));
        Student student2 = new Student("Frida", List.of(89.0, 87.6, 90.5, 45.7));
        Student student3 = new Student("Lisi", List.of(90.0, 98.8, 99.9, 100.0));
        Student student4 = new Student("Max", List.of(34.9, 32.8, 9.0, 67.9));

        displayStudentInfo(student1);
        displayStudentInfo(student2);
        displayStudentInfo(student3);
        displayStudentInfo(student4);


    }

    // Here we see the power of the 'printf' method in action.
    public static void displayStudentInfo(Student student) {
        // With %.1f we can round to the first decimal. %.2f would round to the second decimal point.
        System.out.printf("Name: %s%nAverage Score: %.1f%nGrade: %c%n",
                student.name, calculateAverage(student), getGrade(calculateAverage(student)));
        System.out.println();
    }

    public static double calculateAverage(Student student) {
        double sum = 0;
        for (double score : student.assignmentScores) {
            sum += score;
        }
        return sum / student.assignmentScores.size();
    }

    public static char getGrade(double averageScore) {
        if (averageScore > 90) {
            return 'A';
        } else if (averageScore > 80) {
            return 'B';
        } else if (averageScore > 70) {
            return 'C';
        } else {
            return 'D';
        }
    }
}