package io.everyonecodes.java.t1_data_and_service_classes.exercise3;

//Define the Hiker class that contains the hiker’s name and their telephone number. Provide getters for all properties.
public class Hiker {
    private String name;
    private String telephoneNumber;

    public Hiker(String name, String telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
}
