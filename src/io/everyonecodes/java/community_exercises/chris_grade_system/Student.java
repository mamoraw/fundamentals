package io.everyonecodes.java.community_exercises.chris_grade_system;

import java.util.List;

public class Student {
    String name;
    List<Double> assignmentScores;

    public Student(String name, List<Double> assignmentScores) {
        this.name = name;
        this.assignmentScores = assignmentScores;
    }
}
