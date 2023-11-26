package io.everyonecodes.java.t1_variables.set1.exercise8;

public class crazyVariables {

    public static void main(String[] args) {

        double a = 1.000001;
        double b = 0.000001;
        double c = 1.0;

        double subtraction = a - b;

        System.out.println(c);
        System.out.println(subtraction);

    // what's happening is a rounding error, because of the limitations of the binary system. It's a clash with the IEEE 754 standard. We can use BigDecimal to avoid this issue.
    }
}
