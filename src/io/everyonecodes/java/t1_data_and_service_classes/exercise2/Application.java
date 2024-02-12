package io.everyonecodes.java.t1_data_and_service_classes.exercise2;

//Matilda’s company wants to publish a magazine, and they want to see a preview of the articles included by the editors.
//Develop the code that the editors use to write the magazine and have a preview of it.
//
//Do the following:
//Reuse the Article from exercise 1 (don’t copy it, reuse the existing one from the package where it already is).
//Define the Magazine class that contains a title and a list of articles. Provide getters for all properties.
//Define the Editor class that contains the writeMagazine method which doesn't take any arguments and returns a
//magazine. In order to create a magazine, it first creates three articles (with values of your choice),
//then the magazine and finally returns it.
//Define the Printer class that contains the print method which receives a magazine and displays its title and then
//prints all the articles like in exercise 1.
//Define the Application class which contains the main method.
//Inside, create an editor, use it to write a magazine, create a printer and use it to print a preview of the magazine.
public class Application {
    public static void main(String[] args) {
        // Here I made the method writeMagazine() static, therefore no instance of the class Editor is needed.
        Magazine magazine = Editor.writeMagazine();
        // Same here. Static method, no need for an instance of the Printer class.
        Printer.printMagazine(magazine);
    }
}
