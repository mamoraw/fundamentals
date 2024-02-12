package io.everyonecodes.java.t6_classes.set1.exercise2;
//Do the following:
//Define the Student class that contains two properties: the name and the peer programmer’s name.
//Create two Student instances with the values of your choice.
//Modify one of the previously created instances so that the name of the peer programmer is another one.

public class Main {
    public static void main(String[] args) {
        Student max = new Student("Max", "Gregg");
        Student sepp = new Student("Sepp", "Franz");

        sepp.peersName = "Hans";

        System.out.println(sepp.peersName);
    }

}
