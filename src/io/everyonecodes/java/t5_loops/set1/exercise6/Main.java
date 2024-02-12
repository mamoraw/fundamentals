package io.everyonecodes.java.t5_loops.set1.exercise6;
import java.util.ArrayList;
import java.util.List;
//Hansel wants to rename all the photos on his laptop because he realized that they have the wrong file extension.
// Currently, they all end with “.jpg” but he wants them to end with “.png”.
//
//Define the generateNewName function that receives a file name that ends with “.jpg” and returns the file name
// with the new ending “.png”.
//Define the fileNames list that references all photos on Derek’s computer with the getAllPhotoFileNames function.
//Write the code that the computer uses to rename all the file names from “.jpg” to “.png”.
// To do this, use the available renameFile function below, which pretends to rename a file on disk
// (we will learn how to do this with a real function later).
//
public class Main {
    public static void main(String[] args) {
        List<String> fileNames = new ArrayList<>(List.of());
        fileNames.addAll(getAllPhotoFileNames());

        for (String endsWithJpg : fileNames) {
            String endsWithPng = generateNewName(endsWithJpg);
            renameFile(endsWithJpg, endsWithPng);
        }
    }

    public static String generateNewName(String endsWithJpg) {
        return endsWithJpg.replace("jpg", "png"); // substring(0, filename.length() -4)
    }

    public static void renameFile(String oldName, String newName){
//Dummy renaming function which just prints the names. Usually to rename you will need a function from the java.io.File class.
        System.out.println("File " + oldName + " has been renamed to " + newName);
    }

    public static List<String> getAllPhotoFileNames(){
        List<String> photoList = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            photoList.add("photo" + i + ".jpg");
        }
        return photoList;
    }
}
