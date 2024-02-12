package io.everyonecodes.java.t1_data_and_service_classes.exercise5;

//Define the Shoe class that contains a shoe size and a color.
public class Shoe {
    private int size;
    private String color;

    public Shoe(int size, String color) {
        this.size = size;
        this.color = color;
    }


    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
