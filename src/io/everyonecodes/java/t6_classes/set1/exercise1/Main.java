package io.everyonecodes.java.t6_classes.set1.exercise1;

public class Main {
    public static void main(String[] args) {
        Fruit banana = new Fruit("yellow", false);
        Fruit apple = new Fruit("red", true);
        Fruit cherry = new Fruit("red", true);

        System.out.println(banana.color + apple.color + cherry.color);
    }
}
