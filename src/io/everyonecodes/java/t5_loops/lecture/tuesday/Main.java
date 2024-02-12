package io.everyonecodes.java.t5_loops.lecture.tuesday;
// we have a list of numbers from 1-100, one number is missing. how do we get the missing number?

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 7, 8, 9, 10);

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        int sumShouldBe = 0;
        for (int i = 1; i <= 10; i++) {
            sumShouldBe += i;
        }
        int missingNum = sumShouldBe - sum;
        System.out.println(missingNum);
    }
}
