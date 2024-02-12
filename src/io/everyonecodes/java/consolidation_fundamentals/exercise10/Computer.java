package io.everyonecodes.java.consolidation_fundamentals.exercise10;

public class Computer {
    String brand;
    int yearOfRelease;
    int ramInGb;
    boolean hasSsd;
    boolean hasDedicatedGraphics;
    Processor processor;

    public Computer(String brand, int yearOfRelease, int ramInGb, boolean hasSsd, boolean hasDedicatedGraphics, Processor processor) {
        this.brand = brand;
        this.yearOfRelease = yearOfRelease;
        this.ramInGb = ramInGb;
        this.hasSsd = hasSsd;
        this.hasDedicatedGraphics = hasDedicatedGraphics;
        this.processor = processor;
    }
}
