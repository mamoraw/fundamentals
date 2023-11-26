package io.everyonecodes.java.t1_variables.set1.exercise7;

public class maxValue {

    public static void main(String[] args) {

        int ten = 10;
        int thousend = 1000;
        int million = 1000000;

        // int billion = 10000000000; can't compile

        int maxValue = 2147483647;

        System.out.println(maxValue + 1);

        // adding 1 to the maximum value will change a positive number into a negative and vice versa.
    }
}
