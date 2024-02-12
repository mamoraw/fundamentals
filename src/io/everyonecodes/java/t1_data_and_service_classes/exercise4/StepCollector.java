package io.everyonecodes.java.t1_data_and_service_classes.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Define the StepCollector class that contains the collect method, which asks three times (first Matilda, then Hansel and finally Derek)
//for their number of steps and returns a list with those three integers.
public class StepCollector {
    public List<Integer> collectSteps() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> steps = new ArrayList<>();
        // Ask for the steps three times and add the values to a List.
        for (int i = 0; i < 3; i++) {
            System.out.println("How many steps did your pedometer count?");
            steps.add(scanner.nextInt());
        }
        return steps;
    }
}
